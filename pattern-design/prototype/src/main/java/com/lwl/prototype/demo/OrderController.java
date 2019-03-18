package com.lwl.prototype.demo;

import java.util.Date;

public class OrderController {
    private static OrderService orderService = new OrderService();
    public static void main(String[] args) {
        Order order = new Order();
        order.setId(1L);
        order.setOrderNo("2019030001");
        order.setOrderType(1);
        order.setOrderProductRefId(1L);
        order.setCreateUserId(2L);
        order.setUpdateUserId(2L);
        order.setCreateTime(new Date());
        order.setDescription("aaaaaaa");
        orderService.copyOrder(order);
        orderService.oldCopyOrder(order);
    }
}
