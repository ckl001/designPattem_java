package com.Ljava.design.pattem.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther 20173
 * @Date 2019-4-10 17:00
 * @Des 课程管理实现类
 **/
public class CourseAggregateImpl implements CourseAggregate {

    private List courseList;

    public CourseAggregateImpl() {
        this.courseList = new ArrayList();
    }

    @Override
    public void addCourse(Course course) {
        courseList.add(course);
    }

    @Override
    public void removeCourse(Course course) {
        courseList.remove(course);
    }

    @Override
    public CourseIterator getCourseIterator() {
        return new CourseIteratorImpl(courseList);
    }
}
