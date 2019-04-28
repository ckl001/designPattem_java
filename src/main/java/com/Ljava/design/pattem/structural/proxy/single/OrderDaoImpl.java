package com.Ljava.design.pattem.structural.proxy.single;

/**
 * @Auther 20173
 * @Date 2019-4-10 10:36
 * @Des Dao实现类
 **/
public class OrderDaoImpl implements IOrderDao{
    @Override
    public int insert(Order order) {
        System.out.println("Dao层添加Order成功");
        return 1;
    }
}
