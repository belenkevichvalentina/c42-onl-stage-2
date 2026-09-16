package com.example.c42onl.homework_25;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

/*Написать приложение, которое при запуске будет сообщать в консоль что оно
работает. На любой запрос в консоли должна отображаться запись со временем этого
запроса.
Создать 2 эндпоинта:
/book - который будет скачивать с сервера клиенту любую книгу.
/load-book - который позволит загружать свои книги на сервер.*/

@WebServlet(name = "UploadBookServlet", value = "/book")
@MultipartConfig(
        fileSizeThreshold = 1024 * 1024 * 2,
        maxFileSize = 1024 * 1024 * 50,
        maxRequestSize = 1024 * 1024 * 100
)
public class UploadBookServlet extends HttpServlet {
    @Override  // GET http://localhost:8080/book
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("UploadBookServlet Servlet");
        resp.getWriter().println("book UploadBookServlet");
//        resp.setContentType("text/html;charset=UTF-8");
//        try (PrintWriter writer = resp.getWriter()) {
//            writer.println("<h3> Загрузка своей книги на сервер</h3>");
//            writer.println("<form action='load-book' method='post' enctype='multipart/form-data'>");
//            writer.println("<input type='file' name='bookFile' required><br><br>");
//            writer.println("<button type='submit'>Отправить книгу на сервер</button>");
//            writer.println("</form>");
//        }
//    }
//
//
//    @Override
//    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        resp.setContentType("text/html;charset=UTF-8");
//        PrintWriter writer = resp.getWriter();
//        String uploadPath = "D:\\uploaded_books";
//        File uploadDir = new File(uploadPath);
//        if (!uploadDir.exists()) {
//            uploadDir.mkdir();
//        }
//        try{
//            Part filePart = req.getPart("bookFile");
//            String fileName = filePart.getSubmittedFileName();
//            String finalPath = uploadPath + File.separator + fileName;
//            writer.println("<h3 style='color:green;'> Книга '" + fileName + "' успешно загружена на сервер!</h3>");
//            writer.println("<p>Путь сохранения: <i>" + finalPath + "</i></p>");
//            writer.println("<a href='load-book'>Загрузить еще одну</a>");
//        }catch (Exception e) {
//            writer.println("<h3 style='color:red;'> Ошибка загрузки файла: " + e.getMessage() + "</h3>");
//        }
    }

}

