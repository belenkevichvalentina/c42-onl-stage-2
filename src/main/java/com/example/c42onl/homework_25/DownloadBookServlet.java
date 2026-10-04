package com.example.c42onl.homework_25;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;

// GET http://localhost:8080/load-book
@WebServlet(name = "DownloadBookServlet", value = "/load-book")
public class DownloadBookServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("DownloadBookServlet Servlet");
        resp.getWriter().println("load-book DownloadBookServlet");
//        File bookFile = new File("D:\\java_book.txt");
//        if (!bookFile.exists()) {
//            resp.setContentType("text/html;charset=UTF-8");
//            resp.getWriter().println("<h3> Ошибка: Книга на сервере не найдена.</h3>");
//            return;
//        }
//        resp.setContentType("application/octet-stream");
//        resp.setContentLength((int) bookFile.length());
//        resp.setHeader("Content-Disposition", "attachment; filename=\"" + bookFile.getName() + "\"");
//        try(FileInputStream inputStream = new FileInputStream(bookFile);
//            OutputStream outputStream = resp.getOutputStream()) {
//            byte[] buffer = new byte[4096];
//            int bytesRead;
//            while ((bytesRead = inputStream.read(buffer)) != -1){
//                outputStream.write(buffer, 0, bytesRead);
//            }
//            outputStream.flush();
//        }
    }
}
