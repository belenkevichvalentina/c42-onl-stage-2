package com.dz33.storage;

import com.dz33.model.Profile;
import com.dz33.model.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class JdbcAccountStorage {

    public void saveUser(User user){
        try {
            Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "root");
            try {
                connection.setAutoCommit(false);
                PreparedStatement preparedStatement1 = connection.prepareStatement("INSERT INTO profiles VALUES (default, ?) RETURNING id");
                preparedStatement1.setString(1, user.getProfile().getEmail());
                ResultSet resultSet = preparedStatement1.executeQuery();
                 resultSet.next();
                long pId = resultSet.getLong(1);
                PreparedStatement preparedStatement2 = connection.prepareStatement("INSERT INTO users VALUES (default, ?, ?, ?, ?)");
                preparedStatement2.setString(1, user.getName());
                preparedStatement2.setString(2, user.getUsername());
                preparedStatement2.setString(3, user.getPassword());
                preparedStatement2.setLong(4, pId);
                preparedStatement2.execute();
                connection.commit();
            }        catch (SQLException e) {
                connection.rollback();
                throw e;
            }

        }

        catch (SQLException e) {

            throw new RuntimeException("Ошибка при транзакции сохранения пользователя",e);
        }
    }

    public void updateById (Long id, String newName, String newUsername, String newPassword, String email){
        try {
             Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "root");
            connection.setAutoCommit(false);
            try {
                try(PreparedStatement preparedStatement = connection.prepareStatement("UPDATE users SET name = ?, username = ?, password = ? WHERE id = ?")){
                    preparedStatement.setString(1, newName);
                    preparedStatement.setString(2, newUsername);
                    preparedStatement.setString(3, newPassword);
                    preparedStatement.setLong(4, id);
                    preparedStatement.execute();
                }
                try (PreparedStatement ps = connection.prepareStatement("UPDATE profiles SET email = ? WHERE id = (SELECT profile_id FROM users WHERE id = ?)")) {
                    ps.setString(1, email);
                    ps.setLong(2, id);
                    ps.executeUpdate();


                }
                connection.commit();

            } catch (SQLException e) {
                connection.rollback();
                throw e;
            }


         } catch (SQLException e) {
             throw new RuntimeException("Ошибка при обновлении аккаунта",e);
         }
    }
     public List<User> findAll(){
         try {
             Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "root");
             PreparedStatement preparedStatement = connection.prepareStatement("SELECT u.id, u.name, u.username, u.password, p.id, p.email FROM users u JOIN profiles p ON p.id = u.profile_id");

             ResultSet resultSet = preparedStatement.executeQuery();


             List<User> users = new ArrayList<>();
             while (resultSet.next()){
              long id = resultSet.getLong(1);
              String name = resultSet.getString(2);
              String username = resultSet.getString(3);
              String password = resultSet.getString(4);
              long pId = resultSet.getLong(5);
              String email = resultSet.getString(6);

              Profile profile = new Profile(pId, email);
              User user = new User(id, name, username, password, profile);
              users.add(user);
             }

             return users;
         } catch (SQLException e) {
             throw new RuntimeException("Ошибка при получении всех пользователей",e);
         }


     }

     public Optional<User> findByUsername(String username) {
         try {
             Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "root");
             PreparedStatement preparedStatement = connection.prepareStatement("SELECT u.id AS user_id, u.name, " +
                     "u.username, u.password, p.id AS profile_id, p.email FROM users u " +
                     "JOIN profiles p on p.id = u.profile_id WHERE username = ?");
             preparedStatement.setString(1, username);
             ResultSet resultSet = preparedStatement.executeQuery();


             if (resultSet.next()){
                 long id = resultSet.getLong("user_id");
                 String name = resultSet.getString("name");
                 String uname = resultSet.getString("username");
                 String password = resultSet.getString("password");

                 Long pId = resultSet.getLong("profile_id");
                 String pEmail = resultSet.getString("email");

                 Profile profile = new Profile(pId, pEmail);
                 User user = new User(id, name, uname, password, profile);

                 return Optional.of(user);
             }
             return Optional.empty();

         } catch (SQLException e) {
             throw new RuntimeException("Ошибка при поиске по username",e);
         }
     }

    public Optional<User> findById(Long id) {
        try {
            Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "root");
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT u.id, u.name, u.username, u.password, p.id, p.email FROM users u JOIN profiles p ON p.id = u.profile_id WHERE u.id = ?");
            preparedStatement.setLong(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();


            if (resultSet.next()){
                long userId = resultSet.getLong(1);
                String name = resultSet.getString(2);
                String uname = resultSet.getString(3);
                String password = resultSet.getString(4);

                Long pId = resultSet.getLong(5);
                String pEmail = resultSet.getString(6);

                Profile profile = new Profile(pId, pEmail);
                User user = new User(userId, name, uname, password, profile);

                return Optional.of(user);
            }
            return Optional.empty();

        } catch (SQLException e) {
            throw new RuntimeException("Ошибка поиска по ID",e);
        }
    }


    public void deleteUserById(Long id)  {
       try(Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "root")){
           connection.setAutoCommit(false);
           try {
        try(PreparedStatement preparedStatementProfile = connection.prepareStatement("DELETE FROM profiles WHERE id = (SELECT profile_id FROM users WHERE id = ?)")) {

                preparedStatementProfile.setLong(1, id);

                preparedStatementProfile.executeUpdate();


        }catch (SQLException e) {

            throw new RuntimeException("Ошибка при удалении пользователя с ID: " + id, e);
        }
        try(PreparedStatement preparedStatementUser = connection.prepareStatement("DELETE FROM users WHERE id = ?")) {
            preparedStatementUser.setLong(1, id);

            preparedStatementUser.executeUpdate();
        }
        connection.commit();
       }catch (SQLException e) {
               connection.rollback();
               throw e;
           }


       }catch (SQLException e) {

           throw new RuntimeException("Ошибка при удалении пользователя с ID: " + id, e);
       }
    }



}
