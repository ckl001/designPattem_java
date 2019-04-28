package com.Ljava.design.pattem.structural.adapter.objectadapter;

/**
 * @Auther 20173
 * @Date 2019-4-9 14:22
 * @Des 适配器
 **/
public class Adapter implements Target {
    private Adaptee adaptee = new Adaptee();
    @Override
    public void request() {
        adaptee.adapterRequest();
    }
}
