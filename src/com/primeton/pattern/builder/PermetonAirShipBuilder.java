package com.primeton.pattern.builder;

/**
 * StringBuilder xml解析中的JDOM库中的：DomBuilder，SaxBuilxder
 * Created by Administrator on 16-4-3.
 */
public class PermetonAirShipBuilder implements AirShipBuilder{
    @Override
    public OrbitalModule buildOrbitalModule() {
        System.out.println("构建普元牌轨道舱");
        return new OrbitalModule("普元牌轨道舱");
    }

    @Override
    public Engine buildEngine() {
        System.out.println("构建普元牌发动机");
        return new Engine("普元牌发动机");
    }

    @Override
    public EscapeTower buildEscapeTower() {
        System.out.println("构建普元牌逃逸塔");
        return new EscapeTower("普元牌逃逸塔");
    }
}
