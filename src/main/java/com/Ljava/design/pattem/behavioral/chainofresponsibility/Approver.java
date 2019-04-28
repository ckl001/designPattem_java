package com.Ljava.design.pattem.behavioral.chainofresponsibility;

/**
 * @Auther 20173
 * @Date 2019-4-10 14:38
 * @Des 审批(抽象)
 **/
public abstract class Approver {

    protected Approver approver;

    /**
     * 设置下一个审批对象
     * @param approver
     */
    public void setNextApprover(Approver approver) {
        this.approver = approver;
    }

    public abstract void deploy(Course course);
}
