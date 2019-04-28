package com.Ljava.design.pattem.behavioral.command;

/**
 * @Auther 20173
 * @Date 2019-4-10 15:09
 * @Des TODO
 **/
public class Test {

    public static void main(String[] args) {
        CourseVideo courseVideo = new CourseVideo("Java课程视频 -- ck.com");
        OpenCourseVideoCommand openCourseVideoCommand = new OpenCourseVideoCommand(courseVideo);
        CloseCourseVideoCommand closeCourseVideoCommand = new CloseCourseVideoCommand(courseVideo);

        Staff staff = new Staff();
        staff.addCommand(openCourseVideoCommand);
        staff.addCommand(closeCourseVideoCommand);
        staff.executeCommands();

    }
}
