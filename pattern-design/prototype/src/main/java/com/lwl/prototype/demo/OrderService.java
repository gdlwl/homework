package com.lwl.prototype.demo;

import java.util.Date;

public class OrderService {

    public void copyOrder(Order sourceOrder){

        //1.根据原订单复制新订单
        Order copyOrder = (Order)sourceOrder.copyEntity();
        //2.修改复制订单信息.
        copyOrder.setOrderNo("2019030002");
        //保存复制订单dao.saveOrder
        System.out.println("订单复制成功"+copyOrder);
    }

    public void oldCopyOrder(Order sourceOrder){

        //1.根据原订单复制新订单
        Order copyOrder = new Order();
        //2.修改复制订单信息.
        copyOrder.setId(null);
        copyOrder.setCreateUserId(sourceOrder.getCreateUserId());
        copyOrder.setUpdateUserId(sourceOrder.getUpdateUserId());
        copyOrder.setCreateTime(new Date());
        copyOrder.setUpdateTime(new Date());
        copyOrder.setOrderNo("2019030002");
        copyOrder.setOrderType(sourceOrder.getOrderType());
        copyOrder.setOrderProductRefId(sourceOrder.getOrderProductRefId());
        copyOrder.setDescription(sourceOrder.getDescription());
        //保存复制订单dao.saveOrder
        System.out.println("订单复制成功"+copyOrder);
    }
}
