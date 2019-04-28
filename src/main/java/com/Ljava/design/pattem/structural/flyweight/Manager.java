package com.Ljava.design.pattem.structural.flyweight;

/**
 * @Auther 20173
 * @Date 2019-4-9 16:37
 * @Des 管理者
 **/
public class Manager implements Employee {
    @Override
    public void report() {
        System.out.println();
    }

    private String title = "部门经理";
    private String department;
    private String reportContent;

    public void setReportContent(String reportContent) {
        this.reportContent = reportContent;
    }

    public Manager(String department) {
        this.department = department;
    }

}
