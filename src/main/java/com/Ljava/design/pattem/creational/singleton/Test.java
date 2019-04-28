package com.Ljava.design.pattem.creational.singleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @Auther 20173
 * @Date 2019-4-8 11:52
 * @Des 测试类
 **/
public class Test {

    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {

        //饿汉模式 对象序列化
//        HungrySingleton instance = HungrySingleton.getInstance();
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\MyCode\\designPattem\\src\\main\\java\\com\\Ljava\\design\\pattem\\creational\\singleton\\instance_file.txt"));
//        oos.writeObject(instance);
//        File file = new File("D:\\MyCode\\designPattem\\src\\main\\java\\com\\Ljava\\design\\pattem\\creational\\singleton\\instance_file.txt");
//        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
//        HungrySingleton newInstance = (HungrySingleton) ois.readObject();
//        System.out.println(instance);
//        System.out.println(newInstance);

        //饿汉模式 反射破解单例模式
//        Class objectClass = HungrySingleton.class;
//        Constructor constructor = objectClass.getDeclaredConstructor();
//        constructor.setAccessible(true);
//        HungrySingleton instanceClass = HungrySingleton.getInstance();
//        HungrySingleton newInstanceClass = (HungrySingleton) constructor.newInstance();
//        System.out.println(instanceClass);
//        System.out.println(newInstanceClass);

        EnumInstance enumInstance = EnumInstance.getInstance();
        enumInstance.prinTest();


    }
}
