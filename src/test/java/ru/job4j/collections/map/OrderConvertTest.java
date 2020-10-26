package ru.job4j.collections.map;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class OrderConvertTest {

    @Test
    public void whenSingleOrder() {
        List<Order> orders = new ArrayList<>();
        orders.add(new Order("qqqw111", "Ilia"));
        Map<String, Order> mapOrders = new HashMap<>();
        mapOrders = OrderConvert.process(orders);
        assertThat(mapOrders.get("qqqw111"), is(new Order("qqqw111", "Ilia")));
    }
}