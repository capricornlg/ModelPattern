package com.primeton.pattern.builder;

/**
 * Created by Administrator on 16-4-3.
 */
public class PermetionAirShipDirector implements AirShipDirector {

    public PermetionAirShipDirector(AirShipBuilder builder) {
        this.builder = builder;
    }

    private AirShipBuilder builder;

    @Override
    public AirShip directAirShip() {
        Engine e = builder.buildEngine();
        OrbitalModule o =builder.buildOrbitalModule();
        EscapeTower tower = builder.buildEscapeTower();

        AirShip ship = new AirShip();
        ship.setEngine(e);
        ship.setEscapeTower(tower);
        ship.setOrbitalModule(o);

        return ship;
    }
}
