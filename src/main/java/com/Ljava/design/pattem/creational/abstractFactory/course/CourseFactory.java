package com.Ljava.design.pattem.creational.abstractFactory.course;


import com.Ljava.design.pattem.creational.abstractFactory.article.Article;
import com.Ljava.design.pattem.creational.abstractFactory.video.Video;

/**
 * @Auther 20173
 * @Date 2019-4-8 15:59
 * @Des 课程工厂
 **/
public interface CourseFactory {
    Video getVideo();
    Article getArticle();
}
