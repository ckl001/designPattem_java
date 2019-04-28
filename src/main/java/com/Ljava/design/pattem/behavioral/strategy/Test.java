package com.Ljava.design.pattem.behavioral.strategy;

/**
 * @Auther 20173
 * @Date 2019-4-15 12:00
 * @Des TODO
 **/
public class Test {

    public static void main(String[] args) {
        PromotionActivity promotionActivity618 = new PromotionActivity(new LiJianPromotionStrategy());
        PromotionActivity promotionActivity1111 = new PromotionActivity(new FanXianPromotionStrategy());

        promotionActivity618.executePromotionStrategy();
        promotionActivity1111.executePromotionStrategy();
    }
}
