package com.dz33;

import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;
import jakarta.servlet.annotation.WebServlet;

@WebListener
public class Listener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
