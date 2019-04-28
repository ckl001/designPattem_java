package com.Ljava.design.pattem.structural.decorator;

/**
 * @Auther 20173
 * @Date 2019-4-9 16:04
 * @Des 鸡蛋装饰者
 **/
public class EggDecorator extends AbstractDecorator {
    public EggDecorator(ABattercake aBattercake) {
        super(aBattercake);
    }

    @Override
    protected String getDesc() {
        return super.getDesc()+" 加一个鸡蛋";
    }

    @Override
    protected int cost() {
        return super.cost()+1;
    }
}
