package com.Ljava.design.pattem.creational.singleton;

/**
 * @Auther 20173
 * @Date 2019-4-8 14:34
 * @Des 单例模式： 静态内部类
 **/
public class StaticInnerClassSingleton {

    //内部类
    private static class InnerClass{
        private static StaticInnerClassSingleton staticInnerClassSingleton = new StaticInnerClassSingleton();
    }

    private static StaticInnerClassSingleton getInstance(){
        return InnerClass.staticInnerClassSingleton;
    }

    //防止反射调用
    private StaticInnerClassSingleton(){
        if(InnerClass.staticInnerClassSingleton != null){
            throw new RuntimeException("单例构造器禁止反射调用");
        }
    }
}
