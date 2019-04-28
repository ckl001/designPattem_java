package com.Ljava.design.pattem.creational.abstractFactory.course;

import com.Ljava.design.pattem.creational.abstractFactory.article.Article;
import com.Ljava.design.pattem.creational.abstractFactory.article.PythonArticle;
import com.Ljava.design.pattem.creational.abstractFactory.video.PythonVideo;
import com.Ljava.design.pattem.creational.abstractFactory.video.Video;

/**
 * @Auther 20173
 * @Date 2019-4-8 16:03
 * @Des py课程工厂
 **/
public class PythonCourseFactory implements CourseFactory {
    @Override
    public Video getVideo() {
        return new PythonVideo();
    }

    @Override
    public Article getArticle() {
        return new PythonArticle();
    }
}

