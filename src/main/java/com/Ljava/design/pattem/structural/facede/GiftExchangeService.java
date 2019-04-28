package com.Ljava.design.pattem.structural.facede;

/**
 * @Auther 20173
 * @Date 2019-4-9 16:20
 * @Des TODO
 **/
public class GiftExchangeService {

    private QualifyService qualifyService = new QualifyService();
    private PointsPaymentService pointsPaymentService = new PointsPaymentService();
    private ShippingService shippingService = new ShippingService();

    public void giftExchange(PointsGift pointsGift){
        //资格校验通过
        if(qualifyService.isAvailable(pointsGift)){
            if(pointsPaymentService.pay(pointsGift)){
                //如果支付积分成功
                String shippingOrderNo = shippingService.shipGift(pointsGift);
                System.out.println("物流系统下单成功,订单号是:"+shippingOrderNo);
            }
        }
    }


}
