package com.pattern;

/**
 * 静态代理：当当网卖书
 */
public class StaticProxySubject implements Subject{
    private RealSubject realSubject;

    public StaticProxySubject(){
        this.realSubject = new RealSubject();//出版社
    }

    @Override
    public void doAction() {
        this.discount();//打折
        this.realSubject.doAction();//卖书
        this.give();//送礼品
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
