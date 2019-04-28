package com.Ljava.design.pattem.structural.adapter.classadapter;

/**
 * @Auther 20173
 * @Date 2019-4-9 14:27
 * @Des TODO
 **/
public class Test {

    public static void main(String[] args) {
        Target target = new ConcreteTarget();
        target.request();

        Target adapterTarget = new Adapter();
        adapterTarget.request();

    }
}
