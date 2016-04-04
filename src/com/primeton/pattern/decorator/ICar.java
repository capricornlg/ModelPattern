package com.primeton.pattern.decorator;

/**
 * Created by Administrator on 16-4-4.
 */
public interface ICar {
    void move();
}

class Car implements ICar {

    @Override
    public void move() {
        System.out.println("陆地上跑");
    }
}

class SuperCar implements ICar {
    private ICar iCar;

    public SuperCar(ICar iCar) {
        this.iCar = iCar;
    }

    @Override
    public void move() {
        iCar.move();
    }

}

class FlyCar extends SuperCar {
    public FlyCar(ICar iCar) {
        super(iCar);
    }

    public void fly() {
        System.out.println("天上飞");
    }

    public void move() {
        super.move();
        fly();
    }
}

class WaterCar extends SuperCar {
    public WaterCar(ICar iCar) {
        super(iCar);
    }

    public void swim() {
        System.out.println("水上漂");
    }

    public void move() {
        super.move();
        swim();
    }
}

class AICar extends SuperCar {
    public AICar(ICar iCar) {
        super(iCar);
    }

    public void autoMove() {
        System.out.println("自动跑");
    }

    public void move() {
        super.move();
        autoMove();
    }
}
