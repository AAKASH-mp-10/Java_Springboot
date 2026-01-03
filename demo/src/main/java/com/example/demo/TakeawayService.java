package com.example.demo;

public class TakeawayService implements OrderProcess{
    @Override
    public void processOrder(double orderID) {
        System.out.println("Order Status: " + "TAKEAWAY");
        System.out.println("Order ID: " + orderID);

    }
}
