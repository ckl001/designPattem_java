package com.Ljava.design.pattem.behavioral.visitor;

/**
 * @Auther 20173
 * @Date 2019-4-15 14:27
 * @Des TODO
 **/
public interface IVisitor {

    void  visit(FreeCourse freeCourse);

    void  visit(CodingCourse codingCourse);
}
