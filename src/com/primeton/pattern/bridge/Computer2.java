package com.primeton.pattern.bridge;

/**
 * Created by Administrator on 16-4-3.
 */
public class Computer2 {

    public Computer2(Brand brand) {
        this.brand = brand;
    }

    protected Brand brand;

    public void sale() {
        brand.sale();
    }
}

class Desktop2 extends Computer2 {

    public Desktop2(Brand brand) {
        super(brand);
    }

    public void sale() {
        super.sale();
        System.out.println("销售台式机");
    }
}


class Laptop2 extends Computer2 {

    public Laptop2(Brand brand) {
        super(brand);
    }

    public void sale() {
        super.sale();
        System.out.println("销售笔记本");
    }
}
