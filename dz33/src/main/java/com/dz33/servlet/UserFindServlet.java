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

@WebServlet("/user/find")
public class UserFindServlet extends HttpServlet {
    private final JdbcAccountStorage jdbcAccountStorage = new JdbcAccountStorage();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if (req.getSession().getAttribute("user") == null){
            resp.sendRedirect(req.getContextPath() + "/user/login");
            return;
        }
        try {
            Long id = Long.parseLong(req.getParameter("id"));
            Optional<User> user = jdbcAccountStorage.findById(id);

            if (user.isPresent()){
                req.setAttribute("foundUser",user.get());
                getServletContext().getRequestDispatcher("/pages/user-profile.jsp").forward(req,resp);
            }else {
                resp.getWriter().println("<h1> Пользователь с ID " + id + " не найден</h1>");
            }

        } catch (Exception e) {
            throw new RuntimeException("Неверный формат ID", e);
        }

    }
}
