package com.Ljava.design.pattem.structural.adapter.classadapter;

/**
 * @Auther 20173
 * @Date 2019-4-9 14:22
 * @Des 适配器
 **/
public class Adapter extends Adaptee implements Target{
    @Override
    public void request() {
        super.adapterRequest();
    }
}
