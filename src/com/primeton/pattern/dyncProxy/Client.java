package com.primeton.pattern.dyncProxy;

import java.lang.reflect.Proxy;

/**
 * struts2中拦截器的实现
 * 数据库连接池关闭处理
 * HIbernate中延迟加载的实现
 * MyBatis中实现拦截器插件
 * Aspect的实现
 * Spring中AOP的实现
 *    日志拦截
 *    声明式事务
 * web service实现
 * RMI远程方法调用
 * Created by Administrator on 16-4-3.
 */
public class Client {

    public static void main(String[] args) {
        Star realStar = new RealStar();

        StarHandler handler = new StarHandler(realStar);

        Star proxy = (Star)Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(),new Class[]{Star.class},handler);

        proxy.bookTicket();
        proxy.sign();
    }
}
