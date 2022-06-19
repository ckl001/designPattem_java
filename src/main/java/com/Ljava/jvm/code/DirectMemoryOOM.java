package com.Ljava.jvm.code;

import java.lang.ref.SoftReference;
import java.lang.reflect.Field;
import java.time.LocalDateTime;
import java.util.Date;
import sun.misc.Unsafe;

/**
 * VM Options： -Xmx20M -XX:MaxDirectMemorySize=10M
 * 使用unsafe分配本机内存
 *
 * @author ckl
 * @version 1.0
 * @date 2022/6/18 13:15
 */
public class DirectMemoryOOM {

    private static final long _1MB = 1024 * 1024;

    public static void main(String[] args) throws IllegalAccessException {
        Field unsafeField = Unsafe.class.getDeclaredFields()[0];
        unsafeField.setAccessible(true);
        Unsafe unsafe = (Unsafe)unsafeField.get(null);
        while (true){
            System.out.printf(String.valueOf(LocalDateTime.now()));
            unsafe.allocateMemory(_1MB);
            System.out.printf(String.valueOf(LocalDateTime.now()));
        }
    }
}
