package com.Ljava.design.pattem.creational.simpleFactory;

/**
 * @Auther 20173
 * @Date 2019-4-8 15:06
 * @Des TODO
 **/
public class Test {

    public static void main(String[] args) {
        VideoFactory videoFactory = new VideoFactory();
        Video video = videoFactory.getVideo(JavaVideo.class);
        if(video == null){
            return;
        }
        video.produce();
    }
}
