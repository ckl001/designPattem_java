package com.Ljava.design.pattem.behavioral.templatemethod;

/**
 * @Auther 20173
 * @Date 2019-4-15 14:24
 * @Des TODO
 **/
public class Test {

    public static void main(String[] args) {
        System.out.println("前端课程start---");
        ACourse feCourse = new FECourse(false);
        feCourse.makeCourse();
        System.out.println("前端课程end---");


        System.out.println("后端设计模式课程start---");
        ACourse designPatternCourse = new DesignPatternCourse();
        designPatternCourse.makeCourse();
        System.out.println("后端设计模式课程end---");
    }
}
