package com.Ljava.design.pattem.behavioral.mediator;

/**
 * @Auther 20173
 * @Date 2019-4-11 15:03
 * @Des TODO
 **/
public class User {

    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private void sendMsg(String msg){
        StudyGroup.showMsg(this, "hello world!");
    }
}
