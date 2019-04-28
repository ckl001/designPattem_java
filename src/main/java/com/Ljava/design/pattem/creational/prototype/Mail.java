package com.Ljava.design.pattem.creational.prototype;

import java.util.Date;

/**
 * @Auther 20173
 * @Date 2019-4-9 10:28
 * @Des 邮箱
 **/
public class Mail implements Cloneable{

    //浅克隆
//    @Override
//    protected Object clone() throws CloneNotSupportedException {
//        System.out.println("克隆");
//        return super.clone();
//    }

    //深克隆
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Mail mail = (Mail)super.clone();

        //深克隆
        mail.birthday = (Date) mail.birthday.clone();
        return mail;
    }

    private Date birthday;
    private String name;
    private String emailAddress;
    private String content;

    public Mail() {
        System.out.println("Mail的构造函数");
    }

    @Override
    public String toString() {
        return "Mail{" +
                "birthday=" + birthday +
                ", name='" + name + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", content='" + content + '\'' +
                '}';
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
