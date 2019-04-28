package com.Ljava.design.pattem.structural.proxy.staticproxy;

import com.Ljava.design.pattem.structural.proxy.single.Order;

/**
 * @Auther 20173
 * @Date 2019-4-10 10:46
 * @Des TODO
 **/
public class Test {

    public static void main(String[] args) {
        Order order = new Order();
        order.setUserId(2);

        OrderServiceStaticProxy orderServiceStaticProxy = new OrderServiceStaticProxy();
        orderServiceStaticProxy.saveOrder(order);
    }
}
