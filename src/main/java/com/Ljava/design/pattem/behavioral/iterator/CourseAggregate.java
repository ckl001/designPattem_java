package com.Ljava.design.pattem.behavioral.iterator;

/**
 * @Auther 20173
 * @Date 2019-4-10 16:52
 * @Des 课程管理（接口）
 **/
public interface CourseAggregate {

    void addCourse(Course course);
    void removeCourse(Course course);

    CourseIterator getCourseIterator();
}
