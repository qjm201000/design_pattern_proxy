package com.pattern;

/**
 * 出版社卖书
 */
public class RealSubject implements Subject{
    @Override
    public void doAction() {
        System.out.println("卖书");
    }
}
