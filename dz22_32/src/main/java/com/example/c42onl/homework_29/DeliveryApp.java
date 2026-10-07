package com.example.c42onl.homework_29;

import com.example.c42onl.homework_29.model.Order;
import com.example.c42onl.homework_29.service.DeliveryService;
import com.example.c42onl.homework_29.service.Discount;
import com.example.c42onl.homework_29.service.impl.discount.BlackFridayDiscount;
import com.example.c42onl.homework_29.service.impl.staff.CarCourier;
import com.example.c42onl.homework_29.service.impl.staff.Courier;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/order") //http://localhost:8080/order?food=Бургер&price=15
public class DeliveryApp extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String foodOrder = req.getParameter("food");
        String priceParam = req.getParameter("price");
        if(foodOrder == null || priceParam == null){
            resp.setContentType("text/html;charset=UTF-8");
            resp.getWriter().println("<h3> Ошибка: Введите параметры заказа в строку!</h3>");
            resp.getWriter().println("<p>Пример: <i>http://localhost:8080/order?food=Пицца&price=30</i></p>");
            return;
        }


        double price = Double.parseDouble(priceParam);
        Order userOrder = new Order(foodOrder,price); //s

            // olid
        Discount discount = new BlackFridayDiscount();
        Courier courier = new CarCourier();

        DeliveryService deliveryService = new DeliveryService(discount,courier);
        req.setAttribute("orderName", userOrder.getFoodName());
        req.setAttribute("oldPrice", userOrder.getPrice());

        double finalPrice = discount.apply(userOrder.getPrice());
        req.setAttribute("finalPrice", finalPrice);
        req.getRequestDispatcher("/pages/order-result.jsp").forward(req, resp);
    }



}
