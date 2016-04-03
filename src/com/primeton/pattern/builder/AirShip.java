package com.primeton.pattern.builder;

/**
 * Created by Administrator on 16-4-2.
 */
public class AirShip {

    private OrbitalModule orbitalModule;
    private Engine engine;
    private EscapeTower escapeTower;

    public EscapeTower getEscapeTower() {
        return escapeTower;
    }

    public void setEscapeTower(EscapeTower escapeTower) {
        this.escapeTower = escapeTower;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public OrbitalModule getOrbitalModule() {
        return orbitalModule;
    }

    public void setOrbitalModule(OrbitalModule orbitalModule) {
        this.orbitalModule = orbitalModule;
    }
}
