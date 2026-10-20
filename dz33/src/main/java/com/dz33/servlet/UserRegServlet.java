package com.dz33.servlet;

import com.dz33.model.Profile;
import com.dz33.model.User;
import com.dz33.storage.JdbcAccountStorage;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


import java.io.IOException;


@WebServlet("/user/reg")
public class UserRegServlet extends HttpServlet {
    private final JdbcAccountStorage jdbcAccountStorage = new JdbcAccountStorage();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/pages/acc-reg.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String email = req.getParameter("email");
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        User user = new User();
        user.setName(name);
        user.setUsername(username);
        user.setPassword(password);
        //Profile profile = new Profile(email);
       Profile profile = new Profile();
       profile.setEmail(email);

       user.setProfile(profile);
        jdbcAccountStorage.saveUser(user);
        resp.sendRedirect("/");
    }
}
