package com.example.c42onl.homework_24;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;



@WebServlet("/checkAge")
public class CheckAgeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        //http://localhost:8080/checkAge?age=19
        String ageStr = req.getParameter("age");
        try {
            int age = Integer.parseInt(ageStr);
            if (age <= 0 || age >= 135){
                resp.getWriter().println("Введен не существующий возраст");
            }else if (age >= 18){
                resp.getWriter().println("Вы совершеннолетний. " + age );
            }else {resp.getWriter().println("Вы не совершеннолетний. " + age );}

        } catch (NumberFormatException e) {
            resp.getWriter().println(" Возраст должен состоять только из цифр.");
        }



    }
}
