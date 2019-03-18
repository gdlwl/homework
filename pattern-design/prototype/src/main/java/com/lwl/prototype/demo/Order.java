package com.lwl.prototype.demo;

import java.io.Serializable;

public class Order extends  BaseEntity implements Serializable{
    private String orderNo;
    private Integer orderType;
    private Long orderProductRefId;

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public Integer getOrderType() {
        return orderType;
    }

    public void setOrderType(Integer orderType) {
        this.orderType = orderType;
    }

    public Long getOrderProductRefId() {
        return orderProductRefId;
    }

    public void setOrderProductRefId(Long orderProductRefId) {
        this.orderProductRefId = orderProductRefId;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderNo='" + orderNo + '\'' +
                ", orderType=" + orderType +
                ", orderProductRefId=" + orderProductRefId +
                "} " + super.toString();
    }
}
