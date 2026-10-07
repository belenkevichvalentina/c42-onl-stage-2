package com.dz33;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(name = "testServlet", value = "/test")
public class TestServlet extends HttpServlet {
    @Override  // GET http://localhost:8080/load-book
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("text/html;charset=UTF-8");
        try (PrintWriter writer = resp.getWriter()) {
            writer.println("<h3> TEST !</h3>");
        }
    }
}