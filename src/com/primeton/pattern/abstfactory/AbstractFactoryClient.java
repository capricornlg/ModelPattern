package com.primeton.pattern.abstfactory;

/**
 * 抽象工厂调用类
 * Created by Administrator on 16-4-2.
 */
public class AbstractFactoryClient {

    public static void main(String[] args) {
        CarFactory factory = new LuxuryCarFactory();
        Engine engine = factory.createEngine();
        engine.run();
        engine.start();
    }
}
