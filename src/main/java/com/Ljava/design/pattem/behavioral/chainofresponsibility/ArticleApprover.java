package com.Ljava.design.pattem.behavioral.chainofresponsibility;


import org.apache.commons.lang.StringUtils;

/**
 * @Auther 20173
 * @Date 2019-4-10 14:40
 * @Des 文章审核
 **/
public class ArticleApprover extends Approver {
    @Override
    public void deploy(Course course) {
        if(StringUtils.isNotEmpty(course.getArticle())){
            System.out.println(course.getName() + "含有手记,批准");
            if(approver != null){
                approver.deploy(course);
            }
        }else {
            System.out.println(course.getName()+"不含有手记,不批准,流程结束");
            return;
        }
    }
}
