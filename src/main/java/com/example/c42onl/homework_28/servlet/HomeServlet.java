package com.example.c42onl.homework_28.servlet;

import com.example.c42onl.homework_28.model.Post;
import com.example.c42onl.homework_28.storage.InMemoryPostStorage;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@WebServlet("/")
public class HomeServlet extends HttpServlet {
    private final InMemoryPostStorage postStorage = new InMemoryPostStorage();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Post> all =postStorage.findAll();
        req.setAttribute("posts",all);
        getServletContext().getRequestDispatcher("/pages/home.jsp").forward(req, resp);
    }
}
