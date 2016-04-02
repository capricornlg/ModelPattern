package com.primeton.abstractfac.factory;

/**
 * Created by Administrator on 16-4-2.
 */
public interface CarFactory {
    Engine createEngine();
    Seat createSeat();
    Tyre createTyre();
}
