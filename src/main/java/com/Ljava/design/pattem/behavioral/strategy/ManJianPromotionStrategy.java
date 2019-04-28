package com.Ljava.design.pattem.behavioral.strategy;

/**
 * @Auther 20173
 * @Date 2019-4-15 11:46
 * @Des 满减促销
 **/
public class ManJianPromotionStrategy implements PromotionStrategy{
    @Override
    public void doPromotion() {
        System.out.println("满减促销,满200-20元");
    }
}
