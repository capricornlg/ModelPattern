package com.primeton.pattern.builder;

/**
 * Created by Administrator on 16-4-3.
 */
public class BilderClient {

    public static void main(String[] args) {

        AirShipDirector director = new PermetionAirShipDirector(new PermetonAirShipBuilder());

        AirShip ship = director.directAirShip();

        System.out.println(ship.getEngine().getName());
    }
}
