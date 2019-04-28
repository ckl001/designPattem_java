package com.Ljava.design.pattem.behavioral.chainofresponsibility;

/**
 * @Auther 20173
 * @Date 2019-4-10 14:40
 * @Des 课程
 **/
public class Course {

    private String name;
    private String article;
    private String video;

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", article='" + article + '\'' +
                ", video='" + video + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArticle() {
        return article;
    }

    public void setArticle(String article) {
        this.article = article;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }
}
