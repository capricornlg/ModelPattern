package com.primeton.pattern.staticProxy;

/**
 * 静态代理
 * Created by Administrator on 16-4-3.
 */
public class Client {
    public static void main(String[] args) {

        Star star = new RealStar();
        Star proxy = new ProxyStar(star);

        proxy.confer();
        proxy.signContract();
        proxy.bookTicket();
        proxy.sign();

        proxy.collectMoney();

    }
}
