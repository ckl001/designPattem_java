package com.Ljava.design.pattem.behavioral.templatemethod;

/**
 * @Auther 20173
 * @Date 2019-4-15 14:23
 * @Des TODO
 **/
public class DesignPatternCourse extends ACourse {
    @Override
    void packageCourse() {
        System.out.println("提供课程Java源代码");
    }

    @Override
    protected boolean needWriteArticle() {
        return true;
    }

}
