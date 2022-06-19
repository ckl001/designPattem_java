package com.Ljava.jvm.code;

import java.lang.reflect.Method;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

/**
 * VM Options： -XX:PermSize=5M -XX:MaxPermSize=5M
 * 借助CGLib使用方法区出现内存溢出
 * JDK1.8已经抛弃这个配置：-XX:PermSize=5M -XX:MaxPermSize=5M
 *
 * @author ckl
 * @version 1.0
 * @date 2022/6/18 12:58
 */
public class JavaMethodAreaOOM {

    public static void main(String[] args) {
        while (true){
            // Enhancer 增强器
            Enhancer enhancer = new Enhancer();
            enhancer.setSuperclass(OOMObject.class);
            enhancer.setUseCache(false);
            enhancer.setCallback(new MethodInterceptor() {
                @Override
                public Object intercept(Object obj, Method method, Object[] objects, MethodProxy methodProxy)
                        throws Throwable {
                    return methodProxy.invokeSuper(obj,args);
                }
            });
            enhancer.create();
        }
    }

    static class OOMObject {

    }
}
