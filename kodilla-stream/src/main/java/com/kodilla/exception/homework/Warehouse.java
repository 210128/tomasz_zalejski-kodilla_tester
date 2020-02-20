package com.kodilla.exception.homework;

import java.util.HashSet;
import java.util.Set;

public class Warehouse {
    public Set<Order> orders = new HashSet<>();

    public void addOrder(Order order) {
        orders.add(order);
    }

    public Order getOrder(String number) throws OrderDoesntExistException {
        Order order1 = null;
        /*TODO Review Stream should be used*/

        var order = orders.stream()
                .filter(o -> o.getNumber().equals(number))
                .findFirst();

       /* if (orders.stream()
                .filter(o -> o.getNumber().equals(number))
                .findFirst().isEmpty())

            throw new OrderDoesntExistException();
*/
        return order.get();
                /*

        for (Order order : orders)
            if (order.getNumber().equals(number)) {
                order1 = order;
            } else throw new OrderDoesntExistException();
        return order1;
*/
    }
}