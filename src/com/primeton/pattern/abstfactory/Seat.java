package com.primeton.pattern.abstfactory;

/**
 * Created by Administrator on 16-4-2.
 */
public interface Seat {
    void massage();
}

class LuxurySeat implements Seat {

    @Override
    public void massage() {
        System.out.println("可以自动按摩");
    }
}


class LowSeat implements Seat {

    @Override
    public void massage() {
        System.out.println("不能自动按摩");
    }
}
