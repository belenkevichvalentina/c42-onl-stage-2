package com.example.c42onl.homework_28.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/save-request")
public class SaveRequestServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/pages/save-request.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        String name = req.getParameter("name");
        String email = req.getParameter("email");
        String message = req.getParameter("message");

        if (name == null || name.trim().isEmpty() ||
                email == null || email.trim().isEmpty() ||
                message == null || message.trim().isEmpty()){
            req.setAttribute("error", "Ошибка: Все поля формы должны быть заполнены.");
            getServletContext().getRequestDispatcher("/pages/save-request.jsp").forward(req,resp);
            return;
        }

        req.setAttribute("name", name);
        req.setAttribute("email", email);
        req.setAttribute("message", message);
        getServletContext().getRequestDispatcher("/pages/success.jsp").forward(req,resp);
        }
    }

