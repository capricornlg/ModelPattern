package com.primeton.pattern.prototype;

import java.util.Date;

/**
 * 测试原型模式(浅克隆)
 * Created by Administrator on 16-4-3.
 */
public class Client {

    public static void main(String[] args) {
        Sheep s1 = new Sheep("多利", new Date(1232232333L));
        System.out.println(s1);
        System.out.println(s1.getName());

        try {
            Sheep s2 = (Sheep) s1.clone();
            System.out.println(s2);
            System.out.println(s2.getName());
            System.out.println(s2.getBirthday());

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
