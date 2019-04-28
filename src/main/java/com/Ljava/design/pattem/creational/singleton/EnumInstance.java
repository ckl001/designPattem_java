package com.Ljava.design.pattem.creational.singleton;

/**
 * @Auther 20173
 * @Date 2019-4-8 11:48
 * @Des 单例：枚举 推荐使用
 **/
public enum EnumInstance {

    INSTANCE{
        protected void prinTest() {
            System.out.println("print test!");
        }
    };

    protected abstract void prinTest();

    public static EnumInstance getInstance(){
        return INSTANCE;
    }

    public Object data;
    public Object getData() {
        return data;
    }
    public void setData(Object data) {
        this.data = data;
    }}
