package com.Ljava.design.pattem.creational.prototype;

import java.text.MessageFormat;

/**
 * @Auther 20173
 * @Date 2019-4-9 10:33
 * @Des 邮件工具类
 **/
public class MailUtil {

    public static void sendMail(Mail mail){
        String outputContent = "向{0}同学,邮件地址:{1},邮件内容:{2},时间: {3} 发送邮件成功";
        System.out.println(MessageFormat.format(outputContent, mail.getName(),mail.getEmailAddress(), mail.getContent(), mail.getBirthday()));
    }

    public static void saveOrginmailRecord(Mail mail){
        System.out.println("保存Orginmail:" + mail.getContent());
    }
}
