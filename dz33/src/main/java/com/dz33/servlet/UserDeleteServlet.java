package com.dz33.servlet;

import com.dz33.storage.JdbcAccountStorage;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.SQLException;

@WebServlet("/user/delete")
public class UserDeleteServlet extends HttpServlet {
    private final JdbcAccountStorage jdbcAccountStorage = new JdbcAccountStorage();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        Long id = Long.parseLong(req.getParameter("id"));
//        try {
//            jdbcAccountStorage.deleteUserById(id);
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//
//        resp.setContentType("text/html;charset=UTF-8");
//        resp.getWriter().println("<h1> Пользователь " + id + " удалён</h1>");
//        resp.getWriter().println("<a href=\"/\">На главную</a>");
//        resp.sendRedirect(req.getContextPath() + "/");
        resp.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "Удаление только через форму");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if (req.getSession().getAttribute("user") == null) {
            resp.sendRedirect(req.getContextPath() + "/user/login");
            return;
        }

        try {
            Long id = Long.parseLong(req.getParameter("id"));
            jdbcAccountStorage.deleteUserById(id);
            resp.setContentType("text/html;charset=UTF-8");
            resp.getWriter().println("<h1> Пользователь " + id + " удалён</h1>");
            resp.sendRedirect(req.getContextPath() + "/");

        } catch (NumberFormatException e) {
            throw new RuntimeException("Неверный ID", e);
        }

    }
}
