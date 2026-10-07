package com.example.c42onl.homework_24;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
/*Задача 1:
Создать приложение, которое при переходе на следующие урлы будет выдавать
результат:
/minsk - время в Минске
/washington - время в Вашингтоне
/beijing - время в Пекине
При решении использовать оба варианта настройки (xml и аннотации).
Задача 2:
Создать сервлет который на вход принимает возраст, а в ответе возвращает
информацию, совершеннолетний или нет*/

@WebServlet("/minsk")
public class MinskTimeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss dd.MM.yyyy");
        resp.getWriter().println(localDateTime.format(formatter));
    }

}
