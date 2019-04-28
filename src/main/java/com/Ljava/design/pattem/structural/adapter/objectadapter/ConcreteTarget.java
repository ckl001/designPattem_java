package com.Ljava.design.pattem.structural.adapter.objectadapter;

/**
 * @Auther 20173
 * @Date 2019-4-9 14:27
 * @Des 当前目标方法
 **/
public class ConcreteTarget implements Target {
    @Override
    public void request() {
        System.out.println("concreteTarget目标方法");
    }
}
