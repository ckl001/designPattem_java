package com.Ljava.design.pattem.creational.factorymethod;

/**
 * @Auther 20173
 * @Date 2019-4-8 16:23
 * @Des py视频工厂
 **/
public class PythonVideoFactory extends VideoFactory{
    @Override
    public Video getVideo() {
        return new PythonVideo();
    }
}
