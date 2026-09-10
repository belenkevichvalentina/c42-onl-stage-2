package com.example.c42onl.homework_25;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

/*Написать приложение, которое при запуске будет сообщать в консоль что оно
работает. На любой запрос в консоли должна отображаться запись со временем этого
запроса.
Создать 2 эндпоинта:
/book - который будет скачивать с сервера клиенту любую книгу.
/load-book - который позволит загружать свои книги на сервер.*/

@WebServlet(name = "UploadBookServlet", value = "/book")

public class UploadBookServlet extends HttpServlet {
    @Override  // GET http://localhost:8080/book
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("UploadBookServlet Servlet");
        resp.getWriter().println("book UploadBookServlet");

    }
}
