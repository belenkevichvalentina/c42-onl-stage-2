package com.dz33.servlet;

import com.dz33.model.User;
import com.dz33.storage.JdbcAccountStorage;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@WebServlet("/user/list")
public class UsersAllServlet extends HttpServlet {
    private final JdbcAccountStorage jdbcAccountStorage = new JdbcAccountStorage();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<User> users = jdbcAccountStorage.findAll();
        req.setAttribute("allUsers", users);

        getServletContext().getRequestDispatcher("/pages/user-list.jsp").forward(req,resp);
    }
}
