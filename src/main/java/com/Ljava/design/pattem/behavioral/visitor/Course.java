package com.Ljava.design.pattem.behavioral.visitor;

/**
 * @Auther 20173
 * @Date 2019-4-15 14:26
 * @Des TODO
 **/
public abstract class Course {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void accept(IVisitor iVisitor);
}
