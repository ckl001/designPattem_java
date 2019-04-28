package com.Ljava.design.pattem.structural.proxy.staticproxy;

import com.Ljava.design.pattem.structural.proxy.db.DataSourceContextHolder;
import com.Ljava.design.pattem.structural.proxy.single.IOrderService;
import com.Ljava.design.pattem.structural.proxy.single.Order;
import com.Ljava.design.pattem.structural.proxy.single.OrderServiceImpl;

/**
 * @Auther 20173
 * @Date 2019-4-10 10:42
 * @Des 订单业务 --》 静态代理类
 **/
public class OrderServiceStaticProxy {

    private IOrderService iOrderService;

    public int saveOrder(Order order){
        beforeMethod(order);
        iOrderService = new OrderServiceImpl();
        int result = iOrderService.saveOrder(order);
        afterMethod(order);
        return  result;
    }


    /**
     * 前置
     * @param order
     */
    private void beforeMethod(Order order){
        int userId = order.getUserId();
        int dbRouter = userId % 2; // 分库处理
        System.out.println("静态代理分配到【db"+dbRouter+"】处理数据");

        //todo 设置dataSource;
        DataSourceContextHolder.setDBType("db"+String.valueOf(dbRouter));
        System.out.println("静态代理 before code");
    }


    /**
     * 后置
     * @param order
     */
    private void afterMethod(Order order){
        System.out.println("静态代理 after code");
    }


}
