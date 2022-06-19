package com.Ljava.jvm.code;

import java.util.ArrayList;
import java.util.List;

/**
 * VM Options: -XX:PermSize=5M -XX:MaxPermSize=5M
 *
 * 需要在JDK1.8以前的版本执行（不包含1.8，已经移除-XX:PermSize=5M -XX:MaxPermSize=5M）
 * 运行时常量池导致内存溢出异常
 * @author ckl
 * @version 1.0
 * @date 2022/6/18 12:43
 */
public class RunTimeConstantPoolOOM {

    public static void main(String[] args) {
        // 使用List保持常量池引用（GC ROOT），避免Full GC回收常量池
        List<String> list = new ArrayList<>();
        // 5MB的PermSize在Integer范围内足够产生OOM了
        int i = 0;
        while (true){
            list.add(String.valueOf(i++).intern());
        }
    }
}
