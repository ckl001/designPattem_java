package com.Ljava.design.pattem.structural.decorator;

/**
 * @Auther 20173
 * @Date 2019-4-9 16:01
 * @Des 煎饼
 **/
public class Battercake extends ABattercake{
    @Override
    protected String getDesc() {
        return "煎饼";
    }

    @Override
    protected int cost() {
        return 5;
    }
}
