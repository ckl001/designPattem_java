package com.Ljava.design.pattem.behavioral.mediator;

import java.util.Date;

/**
 * @Auther 20173
 * @Date 2019-4-11 15:04
 * @Des TODO
 **/
public class StudyGroup {

    public static void showMsg(User user, String msg){
        System.out.println(new Date().toString() + "["+ user.getName() +"] :" + msg);
    }
}
