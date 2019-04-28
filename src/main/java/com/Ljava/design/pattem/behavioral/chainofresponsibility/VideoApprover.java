package com.Ljava.design.pattem.behavioral.chainofresponsibility;

import org.apache.commons.lang.StringUtils;

/**
 * @Auther 20173
 * @Date 2019-4-10 14:43
 * @Des 视频审核
 **/
public class VideoApprover extends Approver{
    @Override
    public void deploy(Course course) {
        if(StringUtils.isNotEmpty(course.getVideo())){
            System.out.println(course.getName()+"含有视频,批准");
            if(approver != null){
                approver.deploy(course);
            }
        }else{
            System.out.println(course.getName()+"不含有视频,不批准,流程结束");
            return;
        }
    }

}