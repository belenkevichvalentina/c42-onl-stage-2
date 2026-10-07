package com.example.c42onl.homework_28.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@WebServlet("/greetingServlet") // localhost:8080/greetingServlet?name=TestJohn
public class GreetingServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // PrintWriter printWriter = resp.getWriter();
        String name = req.getParameter("name");
        String messageUser = "App user %s.".formatted(name);


        String flag = req.getParameter("flag");

        List<String> names = List.of("Terry", "Dmitry", "Mari");

        req.setAttribute("flag",flag);
        req.setAttribute("messageUser", messageUser);
        req.setAttribute("names", names);

        getServletContext().getRequestDispatcher("/pages/greeting.jsp").forward(req, resp);
    }
}
