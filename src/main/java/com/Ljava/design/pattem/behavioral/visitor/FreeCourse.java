package com.Ljava.design.pattem.behavioral.visitor;

/**
 * @Auther 20173
 * @Date 2019-4-15 14:29
 * @Des 免费课程
 **/
public class FreeCourse extends Course{
    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
