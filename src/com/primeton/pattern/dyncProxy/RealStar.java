package com.primeton.pattern.dyncProxy;

/**
 * 静态代理
 * Created by Administrator on 16-4-3.
 */
public class RealStar implements Star {
    @Override
    public void confer() {
        System.out.println("RealStar.confer()");
    }

    @Override
    public void signContract() {
        System.out.println("RealStar.signContract()");
    }

    @Override
    public void bookTicket() {
        System.out.println("RealStar.bookTicket()");
    }

    @Override
    public void sign() {
        System.out.println("RealStar(周杰伦本人).sign()");
    }

    @Override
    public void collectMoney() {
        System.out.println("RealStar.collectMoney()");
    }
}
