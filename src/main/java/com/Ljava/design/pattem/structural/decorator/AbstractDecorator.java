package com.Ljava.design.pattem.structural.decorator;

/**
 * @Auther 20173
 * @Date 2019-4-9 16:02
 * @Des 煎饼装饰者（抽象）
 **/
public abstract class AbstractDecorator extends ABattercake{

    private ABattercake aBattercake;

    public AbstractDecorator(ABattercake aBattercake) {
        this.aBattercake = aBattercake;
    }

    @Override
    protected String getDesc() {
        return this.aBattercake.getDesc();
    }

    @Override
    protected int cost() {
        return this.aBattercake.cost();
    }
}
