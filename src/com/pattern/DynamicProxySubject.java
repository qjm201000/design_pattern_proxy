package com.pattern;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 动态代理
 */
public class DynamicProxySubject implements InvocationHandler {
    private RealSubject realSubject;

    public DynamicProxySubject(){
        this.realSubject = new RealSubject();
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        this.discount();//打折
        Object obj = method.invoke(realSubject,args);
        this.give();//送礼品
        return obj;
    }

    /**
     * 打折
     */
    private void discount(){
        System.out.println("打折");
    }

    /**
     * 送礼品
     */
    private void give(){
        System.out.println("送礼品");
    }
}
