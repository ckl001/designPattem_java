package com.Ljava.design.pattem.behavioral.iterator;

import java.util.List;

/**
 * @Auther 20173
 * @Date 2019-4-10 16:55
 * @Des 课程迭代器
 **/
public class CourseIteratorImpl implements CourseIterator {

    private List courseList;  //课程列表
    private int position;  //当前课程List的下标
    private Course course;

    public CourseIteratorImpl(List courseList) {
        this.courseList = courseList;
    }

    /**
     * 获取下一个课程
     * @return
     */
    @Override
    public Course nextCourse() {
        System.out.println("返回课程，位置是：" + position);
        course = (Course) courseList.get(position);
        position++;
        return course;
    }

    /**
     * 是否为最后一个课程
     * @return
     */
    @Override
    public boolean isLastCourse() {
        if(position < courseList.size()){
            return false;
        }
        return true;
    }
}
