package com.Ljava.design.pattem.behavioral.strategy;

/**
 * @Auther 20173
 * @Date 2019-4-15 11:43
 * @Des 无促销活动
 **/
public class EmptyPromotionStrategy implements PromotionStrategy{
    @Override
    public void doPromotion() {
        System.out.println("无促销活动");
    }
}
