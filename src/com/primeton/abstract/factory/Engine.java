package com.primeton.abstractfactory;

/**
 * Created by Administrator on 16-4-2.
 */
public interface Engine {
    void run();
    void start();
}


class LuxuryEngine implements Engine {

    @Override
    public void run() {
        System.out.println("跑的快");
    }

    @Override
    public void start() {
        System.out.println("启动快，可以自启动");
    }
}

class LuxuryEngine implements Engine {

    @Override
    public void run() {
        System.out.println("跑的慢");
    }

    @Override
    public void start() {
        System.out.println("启动慢，可以自启动");
    }
}