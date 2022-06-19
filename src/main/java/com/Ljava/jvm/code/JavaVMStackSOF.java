package com.Ljava.jvm.code;

/**
 * VM Options: -Xss160k
 *
 * 虚拟机栈、本地方法栈OOM测试
 * @author ckl
 * @version 1.0
 * @date 2022/6/18 12:05
 */
public class JavaVMStackSOF {

    private int stackLength = 1;

    public void stackLeak(){
        stackLength++;
        stackLeak();
    }

    public static void main(String[] args) throws Throwable {
        JavaVMStackSOF oom = new JavaVMStackSOF();
        try {
            oom.stackLeak();
        }catch (Throwable e){
            System.out.println("stack length:" + oom.stackLength);
            throw e;
        }
    }
}
