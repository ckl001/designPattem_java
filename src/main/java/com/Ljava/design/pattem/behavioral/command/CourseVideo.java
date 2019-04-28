package com.Ljava.design.pattem.behavioral.command;

/**
 * @Auther 20173
 * @Date 2019-4-10 15:01
 * @Des 课程视频
 **/
public class CourseVideo {

    private String name;

    public CourseVideo(String name) {
        this.name = name;
    }

    public void open(){
        System.out.println("打开"+ this.name + "课程视频");
    }

    public void close(){
        System.out.println("关闭"+ this.name + "课程视频");
    }
}
