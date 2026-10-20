package com.dz33.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private Long id;
    private String name;
    private String username;
    private String password;
    private Profile profile;

    //public User(long id, String name, String username, String password) {
   //}



//    public User(Long id, String name, String username, String password, Profile profile) {
//        this.id = id;
//        this.name = name;
//        this.username = username;
//        this.password = password;
//        this.profile = profile;
//    }
//
//    public User(long id, String name, String username, String password) {
//    }
//
//    public User() {
//
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getUsername() {
//        return username;
//    }
//
//    public void setUsername(String username) {
//        this.username = username;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//
//    public Profile getProfile() {
//        return profile;
//    }
//
//    public void setProfile(Profile profile) {
//        this.profile = profile;
//    }
@Override
public String toString(){
        return "User \n id - " + id + "\n name - " + name + "\n username - " + username + "\n password - " + password
                + "\n profile" + profile;

}


}


