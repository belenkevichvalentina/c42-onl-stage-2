package com.example.c42onl.homework_29.service;

import com.example.c42onl.homework_29.service.impl.staff.BillCalculator;
import com.example.c42onl.homework_29.service.impl.staff.Courier;
import com.example.c42onl.homework_29.model.Order;

public class DeliveryService {
    private final Discount discountProcessor; //D
    private final Courier currentCourier;//L

    public DeliveryService(Discount discountProcessor, Courier currentCourier) {
        this.discountProcessor = discountProcessor;
        this.currentCourier = currentCourier;
    }
    public void processOrder(Order order){
        System.out.println("Заказ принят - " + order.getFoodName());//S
        BillCalculator billCalculator = new BillCalculator();
        double startSum = billCalculator.calculateTotal(order);
        double finalSum = discountProcessor.apply(startSum);// O D
        System.out.println("Сумма к оплате (с учетом скидки)" + finalSum);
        currentCourier.deliver();//L
        System.out.println("Заказ успешно оформлен.");

    }
}
