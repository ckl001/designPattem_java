package com.Ljava.design.pattem.behavioral.strategy;

/**
 * @Auther 20173
 * @Date 2019-4-15 11:44
 * @Des 返现促销
 **/
public class FanXianPromotionStrategy implements PromotionStrategy{
    @Override
    public void doPromotion() {
        System.out.println("返现促销,返回的金额存放到慕课网用户的余额中");
    }
}
