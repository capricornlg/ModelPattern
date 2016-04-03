package com.primeton.pattern.adapter;

/**
 * 适配器(对象适配器方式)
 * Created by Administrator on 16-4-3.
 */
public class AdapterObject implements Target{

    private Adaptee adaptee;

    public AdapterObject(Adaptee adaptee) {
        super();
        this.adaptee = adaptee;
    }

    @Override
    public void handleReq() {
        adaptee.request();
    }
}
