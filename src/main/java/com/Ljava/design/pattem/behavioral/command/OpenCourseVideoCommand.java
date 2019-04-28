package com.Ljava.design.pattem.behavioral.command;

/**
 * @Auther 20173
 * @Date 2019-4-10 15:04
 * @Des 命令 打开视频
 **/
public class OpenCourseVideoCommand implements Command {

    private CourseVideo courseVideo;

    public OpenCourseVideoCommand(CourseVideo courseVideo) {
        this.courseVideo = courseVideo;
    }

    @Override
    public void execute() {
        courseVideo.open();
    }
}
