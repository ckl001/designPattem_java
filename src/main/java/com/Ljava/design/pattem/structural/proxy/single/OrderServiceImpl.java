package com.Ljava.design.pattem.structural.proxy.single;

/**
 * @Auther 20173
 * @Date 2019-4-10 10:34
 * @Des 订单业务实现类
 **/
public class OrderServiceImpl implements IOrderService {

    private  IOrderDao orderDao;

    @Override
    public int saveOrder(Order order) {
        orderDao = new OrderDaoImpl();
        orderDao.insert(order);
        return 0;
    }
}
