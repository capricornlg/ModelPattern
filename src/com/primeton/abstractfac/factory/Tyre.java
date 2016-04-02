package com.primeton.abstractfac.factory;

/**
 * Created by Administrator on 16-4-2.
 */
public interface Tyre {
    void revolve();
}

class LuxuryTyre implements Tyre {

    @Override
    public void revolve() {
        System.out.println("旋转快不磨损");
    }
}

class LowTyre implements Tyre {

    @Override
    public void revolve() {
        System.out.println("旋转慢磨损");
    }
}
