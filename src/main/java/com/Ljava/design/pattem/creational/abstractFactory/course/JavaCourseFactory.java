package com.Ljava.design.pattem.creational.abstractFactory.course;

import com.Ljava.design.pattem.creational.abstractFactory.article.Article;
import com.Ljava.design.pattem.creational.abstractFactory.article.JavaArticle;
import com.Ljava.design.pattem.creational.abstractFactory.video.JavaVideo;
import com.Ljava.design.pattem.creational.abstractFactory.video.Video;

/**
 * @Auther 20173
 * @Date 2019-4-8 16:01
 * @Des java课程工厂
 **/
public class JavaCourseFactory implements CourseFactory{
    @Override
    public Video getVideo() {
        return new JavaVideo();
    }

    @Override
    public Article getArticle() {
        return new JavaArticle();
    }
}
