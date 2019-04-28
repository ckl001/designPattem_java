package com.Ljava.design.pattem.creational.prototype;

import java.util.Date;

/**
 * @Auther 20173
 * @Date 2019-4-9 10:37
 * @Des TODO
 **/
public class Test {

    public static void main(String[] args) throws CloneNotSupportedException {
        Mail mail = new Mail();
        mail.setContent("初始化邮件模板。。。");
        mail.setBirthday(new Date());
        System.out.println("初始化mail：" + mail.toString());

        Mail mail1 = (Mail) mail.clone();
        mail1.setName("name");
        mail1.setEmailAddress("name@qq.com");
        mail1.setContent("好嗨喔");
        mail.setBirthday(new Date("2019/04/02")); //深克隆，会修改原对象的值
        MailUtil.sendMail(mail1);

        System.out.println(mail1.toString());
        System.out.println("被修改后的mail：" + mail.toString());
        MailUtil.saveOrginmailRecord(mail);
    }
}
