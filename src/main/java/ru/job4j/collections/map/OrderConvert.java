package ru.job4j.collections.map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderConvert {
    public static Map<String, Order> process(List<Order> orders) {
        Map<String, Order> mapOrders = new HashMap<>();
        for (Order order : orders) {
            mapOrders.put(order.getNumber(), order);
        }
        return mapOrders;
    }
}
