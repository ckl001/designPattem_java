package com.Ljava.design.pattem.creational.abstractFactory.article;

/**
 * @Auther 20173
 * @Date 2019-4-8 15:56
 * @Des java文章
 **/
public class JavaArticle extends Article {
    @Override
    public void produce() {
        System.out.println("编写Java文章");
    }
}
