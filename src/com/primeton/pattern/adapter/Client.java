package com.primeton.pattern.adapter;

/**
 * 适配器
 * Created by Administrator on 16-4-3.
 * 适配器使用场景
 * java.io.InputSreamReader(InputStream)
 * java.io.OutputStreamWriter(OutputStream)
 */
public class Client {

    public void test1(Target t) {
        t.handleReq();
    }

    public static void main(String[] args) {
        Client c = new Client();

        Adaptee a = new Adaptee();

        //Target t = new AdapterClass();

        Target t = new AdapterObject(a);

        c.test1(t);
    }
}
