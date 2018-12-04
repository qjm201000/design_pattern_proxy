package com.pattern;

import java.lang.reflect.Proxy;

public class Main {
    public static void main(String[] args) {
        //静态代理
        StaticProxySubject staticProxySubject = new StaticProxySubject();
        staticProxySubject.doAction();//卖书
        System.out.println("----------------------------");

        //动态代理
        DynamicProxySubject dynamicProxySubject = new DynamicProxySubject();
        Subject subject = (Subject) Proxy.newProxyInstance(Subject.class.getClassLoader(), new Class[]{Subject.class},dynamicProxySubject);
        subject.doAction();//卖书
    }
}
