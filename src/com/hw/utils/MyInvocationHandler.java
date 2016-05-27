package com.hw.utils;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 功能说明：TODO
 *
 * @return <br/>
 * 修改历史：<br/>
 * 1.[2016年05月25日上午17:25] 创建方法 by hw
 */
public class MyInvocationHandler implements InvocationHandler {
    private Object obj;

    public MyInvocationHandler(Object target){
        this.obj = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("代理执行");
        return method.invoke(obj,args);
    }
}
