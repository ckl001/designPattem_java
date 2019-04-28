package com.Ljava.design.pattem.behavioral.command;

/**
 * @Auther 20173
 * @Date 2019-4-10 15:06
 * @Des 命令 关闭视频
 **/
public class CloseCourseVideoCommand implements Command {

    private CourseVideo courseVideo;

    public CloseCourseVideoCommand(CourseVideo courseVideo) {
        this.courseVideo = courseVideo;
    }

    @Override
    public void execute() {
        courseVideo.close();
    }
}
