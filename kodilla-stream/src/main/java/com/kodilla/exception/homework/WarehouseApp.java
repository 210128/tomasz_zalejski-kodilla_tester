package com.kodilla.exception.homework;

import java.util.NoSuchElementException;

public class WarehouseApp {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("1/2020"));
        warehouse.addOrder(new Order("2/2020"));
        warehouse.addOrder(new Order("3/2020"));
        warehouse.addOrder(new Order("4/2020"));
        try {
            Order order;
            //order = warehouse.getOrder("3/2020");
            order = warehouse.getOrder("5/2020");
            System.out.println("Order number:" + order);
        } catch (OrderDoesntExistException | NoSuchElementException e) {
            System.out.println("jaki to ma niby sens");
        }

    }
}
