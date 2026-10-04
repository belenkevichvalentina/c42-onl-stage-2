package com.example.c42onl.homework_25;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.Console;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@WebFilter("/*") // <ANY> http://localhost:8080/<any>
public class LoggingFilter extends HttpFilter {
    @Override
    protected void doFilter(HttpServletRequest req, HttpServletResponse res, FilterChain chain) throws IOException, ServletException {

        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss dd.MM.yyyy");
        HttpServletRequest httpServletRequest = (HttpServletRequest) req;
        String path = httpServletRequest.getRequestURI();

        System.out.println("LoggingFilter  - " + localDateTime.format(formatter) + "path - " + path);
        res.getWriter().println("Filter LoggingFilter <ANY> http://localhost:8080/<any>");
        chain.doFilter(req, res);
    }
}
