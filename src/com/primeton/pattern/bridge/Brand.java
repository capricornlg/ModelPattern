package com.primeton.pattern.bridge;

/**
 * Created by Administrator on 16-4-3.
 */
public interface Brand {
    void sale();
}


class Lenovo implements  Brand {

    @Override
    public void sale() {
        System.out.println("销售联想电脑");
    }
}

class Dell implements  Brand {

    @Override
    public void sale() {
        System.out.println("销售dell电脑");
    }
}