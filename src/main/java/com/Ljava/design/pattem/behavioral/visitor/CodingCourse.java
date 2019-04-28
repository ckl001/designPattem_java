package com.Ljava.design.pattem.behavioral.visitor;

/**
 * @Auther 20173
 * @Date 2019-4-15 14:30
 * @Des 实战课程 收费
 **/
public class CodingCourse extends Course {
    private int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
