package com.Ljava.design.pattem.structural.facede;

/**
 * @Auther 20173
 * @Date 2019-4-9 16:18
 * @Des TODO
 **/
public class PointsPaymentService {

    public Boolean pay(PointsGift pointsGift){
        //扣减积分
        System.out.println("支付"+pointsGift.getName()+" 积分成功");
        return true;
    }
}
