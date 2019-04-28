package com.Ljava.design.pattem.behavioral.observer.guavatest;

import com.google.common.eventbus.Subscribe;

/**
 * @Auther 20173
 * @Date 2019-4-12 14:22
 * @Des TODO
 **/
public class GuavaEvent {

    @Subscribe
    public void subscribe(String str){
        System.out.println("执行subscribe方法，传入的参数是：" + str);
    }
}
