package com.Ljava.design.pattem.creational.builder;

/**
 * @Auther 20173
 * @Date 2019-4-9 10:12
 * @Des TODO
 **/
public class Test {

    public static void main(String[] args) {
        Course course = new Course.CourseBuilder().buildCourseName("java建造者").buildCourseArticle("笔记").buildCourseQA("好嗨喔！").build();
        System.out.println(course.toString());
    }
}
