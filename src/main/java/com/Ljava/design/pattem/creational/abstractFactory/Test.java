package com.Ljava.design.pattem.creational.abstractFactory;

import com.Ljava.design.pattem.creational.abstractFactory.article.Article;
import com.Ljava.design.pattem.creational.abstractFactory.course.CourseFactory;
import com.Ljava.design.pattem.creational.abstractFactory.course.JavaCourseFactory;
import com.Ljava.design.pattem.creational.abstractFactory.video.Video;

/**
 * @Auther 20173
 * @Date 2019-4-8 15:06
 * @Des TODO
 **/
public class Test {

    public static void main(String[] args) {
        CourseFactory courseFactory = new JavaCourseFactory();
        Video video = courseFactory.getVideo();
        Article article = courseFactory.getArticle();
        video.produce();
        article.produce();

    }
}
