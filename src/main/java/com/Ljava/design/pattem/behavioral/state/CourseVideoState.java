package com.Ljava.design.pattem.behavioral.state;

/**
 * @Auther 20173
 * @Date 2019-4-12 14:29
 * @Des 课程视频状态
 **/
public abstract class CourseVideoState {

    protected CourseVideoContext courseVideoContext;

    public void setCourseVideoContext(CourseVideoContext courseVideoContext) {
        this.courseVideoContext = courseVideoContext;
    }

    public abstract void play();
    public abstract void speed();
    public abstract void pause();
    public abstract void stop();
}
