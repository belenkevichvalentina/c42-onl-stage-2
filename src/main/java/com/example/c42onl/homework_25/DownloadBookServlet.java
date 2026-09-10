package com.example.c42onl.homework_25;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

// GET http://localhost:8080/load-book
@WebServlet(name = "DownloadBookServlet", value = "/load-book")
public class DownloadBookServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("DownloadBookServlet Servlet");
        resp.getWriter().println("load-book DownloadBookServlet");
    }
}
