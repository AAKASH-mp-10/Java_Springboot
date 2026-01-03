package com.example.demo;

public class OrderService {

    private OrderProcess OrderProcess;

    public OrderService(OrderProcess OrderProcess) {
        this.OrderProcess = OrderProcess;

    }

    public void placeOrder() {

        //var order = new Dinnig();
        OrderProcess.processOrder(001);
        //OrderProcess.processOrder(087);
    }

}
