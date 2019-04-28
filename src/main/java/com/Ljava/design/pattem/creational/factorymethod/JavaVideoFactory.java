package com.Ljava.design.pattem.creational.factorymethod;

/**
 * @Auther 20173
 * @Date 2019-4-8 16:22
 * @Des java视频工厂
 **/
public class JavaVideoFactory extends VideoFactory {

    @Override
    public Video getVideo() {
        return new JavaVideo();
    }
}
