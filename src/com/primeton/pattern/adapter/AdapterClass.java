package com.primeton.pattern.adapter;

/**
 * 类适配器方式
 * Created by Administrator on 16-4-3.
 */
public class AdapterClass extends Adaptee implements Target {
    @Override
    public void handleReq() {
        super.request();
    }
}
