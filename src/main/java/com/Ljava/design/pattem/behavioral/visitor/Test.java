package com.Ljava.design.pattem.behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther 20173
 * @Date 2019-4-15 14:34
 * @Des TODO
 **/
public class Test {

    public static void main(String[] args) {
        List<Course> courseList = new ArrayList<>();

        FreeCourse freeCourse = new FreeCourse();
        freeCourse.setName("SpringMvc课程");

        CodingCourse codingCourse = new CodingCourse();
        codingCourse.setName("Java设计模式 -- By Ck");
        codingCourse.setPrice(399);

        courseList.add(freeCourse);
        courseList.add(codingCourse);

        for (Course course : courseList){
            course.accept(new Visitor());
        }
    }
}
