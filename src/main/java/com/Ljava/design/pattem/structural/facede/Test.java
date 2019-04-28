package com.Ljava.design.pattem.structural.facede;

/**
 * @Auther 20173
 * @Date 2019-4-9 16:21
 * @Des TODO
 **/
public class Test {

    public static void main(String[] args) {
        PointsGift p = new PointsGift("Java Big Data");
        GiftExchangeService giftExchangeService = new GiftExchangeService();
        giftExchangeService.giftExchange(p);
    }
}
