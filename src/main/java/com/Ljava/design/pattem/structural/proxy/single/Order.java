package com.Ljava.design.pattem.structural.proxy.single;

/**
 * @Auther 20173
 * @Date 2019-4-10 10:22
 * @Des 订单
 **/
public class Order {

    private  Object orderInfo;
    private Integer userId;

    public Object getOrderInfo() {
        return orderInfo;
    }

    public void setOrderInfo(Object orderInfo) {
        this.orderInfo = orderInfo;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}
