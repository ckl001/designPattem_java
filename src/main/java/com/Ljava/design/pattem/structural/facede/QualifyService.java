package com.Ljava.design.pattem.structural.facede;

/**
 * @Auther 20173
 * @Date 2019-4-9 16:19
 * @Des TODO
 **/
public class QualifyService {

    public boolean isAvailable(PointsGift pointsGift){
        System.out.println("校验"+pointsGift.getName()+" 积分资格通过,库存通过");
        return true;
    }

}
