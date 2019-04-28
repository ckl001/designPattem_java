package com.Ljava.design.pattem.behavioral.iterator;

/**
 * @Auther 20173
 * @Date 2019-4-10 17:23
 * @Des TODO
 **/
public class Test {

    public static void main(String[] args) {
        Course course1 = new Course("Java设计模式： 单例模式");
        Course course6 = new Course("Java设计模式： 工厂方法模式");
        Course course2 = new Course("Java设计模式： 简单工厂模式");
        Course course3 = new Course("Java设计模式： 抽象工厂模式");
        Course course4 = new Course("Java设计模式： 建造者模式");
        Course course5 = new Course("Java设计模式： 原型模式");


        CourseAggregate courseAggregate = new CourseAggregateImpl();
        courseAggregate.addCourse(course1);
        courseAggregate.addCourse(course2);
        courseAggregate.addCourse(course3);
        courseAggregate.addCourse(course4);
        courseAggregate.addCourse(course5);
        courseAggregate.addCourse(course6);

        System.out.println("-----课程列表-----");
        printCourses(courseAggregate);
        courseAggregate.removeCourse(course4);
        courseAggregate.removeCourse(course5);

        printCourses(courseAggregate);
    }


    public static void printCourses(CourseAggregate courseAggregate){
        CourseIterator courseIterator= courseAggregate.getCourseIterator();
        while(!courseIterator.isLastCourse()){
            Course course=courseIterator.nextCourse();
            System.out.println(course.getName());
        }
    }

}
