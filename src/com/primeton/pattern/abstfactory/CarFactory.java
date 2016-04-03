package com.primeton.pattern.abstfactory;

/**
 * 抽象工厂
 * JDK中Calendar的getInstance方法
 * JDBC中的Connection对象的获取
 * Hibernate中的SessionFactory创建Session
 * Spring中的IOC容器创建管理bean对象
 * XML解析时的DocumentBuilderFactory创建解析器对象
 * 反射中Class对象的newInstance()
 * Created by Administrator on 16-4-2.
 */
public interface CarFactory {
    Engine createEngine();
    Seat createSeat();
    Tyre createTyre();
}
