package com.Ljava.design.pattem.creational.simpleFactory;

/**
 * @Auther 20173
 * @Date 2019-4-8 14:58
 * @Des 视频工厂类
 **/
public class VideoFactory {

    public Video getVideo(Class c){
        Video video = null;
        try{
            //通过反射拿到instance
            video = (Video) Class.forName(c.getName()).newInstance();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return video;
    }
}
