package com.Ljava.design.pattem.behavioral.observer;

import java.util.Observable;

/**
 * @Auther 20173
 * @Date 2019-4-11 16:00
 * @Des 课程
 **/
public class Course extends Observable {

    private String courseName;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void produceQuestion(Course course, Question question){
        System.out.println(question.getUserName()+"在"+course.courseName+"提交了一个问题");
        setChanged();
        notifyObservers(question);
    }

}
