package com.Ljava.design.pattem.creational.singleton;

import java.io.Serializable;

/**
 * @Auther 20173
 * @Date 2019-4-8 11:48
 * @Des 单例：饿汉模式
 **/
public class HungrySingleton implements Serializable {
    private final static HungrySingleton hungrySingleton;
    static {
        hungrySingleton = new HungrySingleton();
    }

    //防止反射破坏单例模式
    private HungrySingleton(){
        if(hungrySingleton != null){
            throw new RuntimeException("单例模式禁止反射调用！");
        }
    }

    public static HungrySingleton getInstance(){
        return hungrySingleton;
    }

    // 解决对象反序列化；
    // 反序列化的时候会进行浅拷贝则返回的对象是新的对象；
    // Singleton中定义readResolve方法，并在该方法中指定要返回的对象的生成策略，就可以防止单例被破坏。
    private Object readResolve(){
        System.out.println("调用了readResolve方法！");
        return hungrySingleton;
    }

}
