package com.primeton.pattern.builder;

/**
 * Created by Administrator on 16-4-2.
 */
public interface AirShipBuilder {

    OrbitalModule buildOrbitalModule();
    Engine buildEngine();
    EscapeTower buildEscapeTower();
}
