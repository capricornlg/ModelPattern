package com.primeton.abstractfac.factory;

/**
 * 抽象工厂
 * Created by Administrator on 16-4-2.
 */
public interface CarFactory {
    Engine createEngine();
    Seat createSeat();
    Tyre createTyre();
}
