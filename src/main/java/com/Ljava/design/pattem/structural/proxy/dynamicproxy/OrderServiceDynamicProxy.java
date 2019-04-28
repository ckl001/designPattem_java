package com.Ljava.design.pattem.structural.proxy.dynamicproxy;

import com.Ljava.design.pattem.structural.proxy.db.DataSourceContextHolder;
import com.Ljava.design.pattem.structural.proxy.single.Order;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Auther 20173
 * @Date 2019-4-10 11:10
 * @Des 订单业务 --》 动态代理
 * InvocationHandler是实现动态代理的核心
 **/
public class OrderServiceDynamicProxy implements InvocationHandler {

    private Object target;

    public OrderServiceDynamicProxy(Object target) {
        this.target = target;
    }

    public Object bind(){
        Class cls = target.getClass();
        return Proxy.newProxyInstance(cls.getClassLoader(),cls.getInterfaces(),this);
    }


    /**
     *
     * @param proxy 代理实例上调用方法
     * @param method
     * @param args
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println(method);
        for (Object obj : args) {
            System.out.println(((Order)obj).getUserId());
        }

        Object argobject = args[0];
        beforeMethod(argobject);
        Object object = method.invoke(target, args);
        afterMethod();
        return object;
    }


    private void beforeMethod(Object obj){
        int userId = 0;
        System.out.println("动态代理 before code");
        if(obj instanceof Order){
            Order order = (Order)obj;
            userId = order.getUserId();
        }
        int dbRouter = userId % 2;
        System.out.println("动态代理分配到【db"+dbRouter+"】处理数据");

        DataSourceContextHolder.setDBType("db"+String.valueOf(dbRouter));
    }

    private void afterMethod(){
        System.out.println("动态代理 after code" );
    }


}
