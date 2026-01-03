package com.example.demo;

public class DinnigService implements OrderProcess {
    @Override
    public void processOrder(double orderID){
        System.out.println("Order Status: " + "DINNIG");
        System.out.println("Order ID: " + orderID);

    }
}
