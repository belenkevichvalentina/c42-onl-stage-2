package com.dz33.servlet;

import com.dz33.model.User;
import com.dz33.storage.JdbcAccountStorage;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Optional;

@WebServlet("/user/login")
public class UserLoginServlet extends HttpServlet {
    private final JdbcAccountStorage jdbcAccountStorage = new JdbcAccountStorage();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/pages/acc-login.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        Optional<User> byUsername = jdbcAccountStorage.findByUsername(username);
        if (byUsername.isPresent()){
           User user = byUsername.get();
           if (user.getPassword().equals(password)){
               req.getSession().setAttribute("user", user);
               resp.sendRedirect("/");
               return;
           }
        }

        getServletContext().getRequestDispatcher("/pages/acc-login.jsp").forward(req,resp);
    }
}
