package com.Ljava.design.pattem.structural.proxy.dynamicproxy;

import com.Ljava.design.pattem.structural.proxy.single.IOrderService;
import com.Ljava.design.pattem.structural.proxy.single.Order;
import com.Ljava.design.pattem.structural.proxy.single.OrderServiceImpl;

/**
 * @Auther 20173
 * @Date 2019-4-10 11:22
 * @Des TODO
 **/
public class Test {
    public static void main(String[] args) {
        Order order = new Order();
//        order.setUserId(2);
        order.setUserId(1);
        IOrderService orderServiceDynamicProxy = (IOrderService) new OrderServiceDynamicProxy(new OrderServiceImpl()).bind();

        orderServiceDynamicProxy.saveOrder(order);
    }
}
