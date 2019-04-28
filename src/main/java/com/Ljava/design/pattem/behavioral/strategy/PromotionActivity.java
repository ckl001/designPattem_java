package com.Ljava.design.pattem.behavioral.strategy;

/**
 * @Auther 20173
 * @Date 2019-4-15 11:38
 * @Des 促销活动
 **/
public class PromotionActivity {
    private PromotionStrategy promotionStrategy;

    public PromotionActivity(PromotionStrategy promotionStrategy) {
        this.promotionStrategy = promotionStrategy;
    }

    public void executePromotionStrategy(){
        promotionStrategy.doPromotion();
    }
}
