package com.Ljava.design.pattem.creational.factorymethod;

/**
 * @Auther 20173
 * @Date 2019-4-8 15:06
 * @Des TODO
 **/
public class Test {

    public static void main(String[] args) {
        VideoFactory videoFactory = new JavaVideoFactory();
        Video video = videoFactory.getVideo();
        video.produce();

        VideoFactory videoFactory2 = new PythonVideoFactory();
        Video video2 = videoFactory2.getVideo();
        video2.produce();
    }
}
