package com.Ljava.design.pattem.behavioral.observer.guavatest;

import com.google.common.eventbus.EventBus;

/**
 * @Auther 20173
 * @Date 2019-4-12 14:23
 * @Des TODO
 **/
public class GuavaEventTest {

    public static void main(String[] args) {
        EventBus eventBus = new EventBus();
        GuavaEvent guavaEvent = new GuavaEvent();

        eventBus.register(guavaEvent);
        eventBus.post("post的内容");
    }
}
