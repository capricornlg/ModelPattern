package com.primeton.pattern.dyncProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by Administrator on 16-4-3.
 */
public class StarHandler implements InvocationHandler {

    private Star realStar;

    public StarHandler(Star realStar) {
        this.realStar = realStar;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object object = null;
        if(method.getName().equals("sign")) {
            object = method.invoke(realStar,args);
        }

        return object;
    }
}
