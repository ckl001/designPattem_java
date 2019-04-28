package com.Ljava.design.pattem.creational.singleton;

/**
 * @Auther 20173
 * @Date 2019-4-8 14:06
 * @Des 单例： 懒汉模式--双重锁
 **/
public class LazyDoubleCheckSingleton {
    // volatile 防止指令重排，内存可见性
    private volatile static LazyDoubleCheckSingleton lazyDoubleCheckSingleton = null;
    public LazyDoubleCheckSingleton() {
    }

    public static LazyDoubleCheckSingleton getInstance(){
        if(lazyDoubleCheckSingleton == null){
            synchronized (LazyDoubleCheckSingleton.class){
                if(lazyDoubleCheckSingleton == null){
                    // 1.分配内存给这个对象
                    // 2.初始化这个对象
                    // 3.设置lazyDoubleCheckSingleton 指向刚分配的内存地址
                    // 指令重排：第二步跟第三步的顺序调换
                    lazyDoubleCheckSingleton = new LazyDoubleCheckSingleton();
                }
            }
        }
        return lazyDoubleCheckSingleton;
    }
}
