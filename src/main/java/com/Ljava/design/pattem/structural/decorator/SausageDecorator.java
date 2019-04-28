package com.Ljava.design.pattem.structural.decorator;

/**
 * @Auther 20173
 * @Date 2019-4-9 16:05
 * @Des TODO
 **/
public class SausageDecorator extends AbstractDecorator{
    public SausageDecorator(ABattercake aBattercake) {
        super(aBattercake);
    }


    @Override
    protected String getDesc() {
        return super.getDesc()+" 加一根香肠";
    }

    @Override
    protected int cost() {
        return super.cost()+2;
    }
}
