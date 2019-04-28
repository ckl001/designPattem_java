package com.Ljava.design.pattem.behavioral.observer;

/**
 * @Auther 20173
 * @Date 2019-4-11 16:13
 * @Des TODO
 **/
public class Test {

    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Alpha");
        Teacher teacher2 = new Teacher("Beta");

        Course course = new Course("设计模式");
        course.addObserver(teacher1);
        course.addObserver(teacher2);

        //业务逻辑代码
        Question question = new Question();
        question.setUserName("Geeker");
        question.setQuestionContent("Java的主函数如何编写");

        course.produceQuestion(course,question);

    }
}
