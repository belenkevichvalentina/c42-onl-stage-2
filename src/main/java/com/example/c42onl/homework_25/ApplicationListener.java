package com.example.c42onl.homework_25;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;
import jakarta.servlet.http.HttpSessionAttributeListener;
import jakarta.servlet.http.HttpSessionEvent;
import jakarta.servlet.http.HttpSessionListener;

import java.time.LocalDateTime;


@WebListener
public class ApplicationListener implements ServletContextListener, HttpSessionListener, HttpSessionAttributeListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        ServletContext servletContext = sce.getServletContext();
        servletContext.setAttribute("greeting", "Hello World!");
        System.out.println("The application has been launched. It is running.");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("The application is turned off.");
    }
    //    @Override
//    public void sessionCreated (HttpSessionEvent sessionEvent){
//        sessionEvent.getSession().setAttribute("sessionCreated", LocalDateTime.now());
//    }
}
