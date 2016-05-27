package com.hw.utils;

import java.lang.reflect.Proxy;

import com.hw.pojo.UsersService;
import com.hw.pojo.UsersServiceImpl;


/**
 * 功能说明：TODO
 *
 * @return <br/>
 * 修改历史：<br/>
 * 1.[2016年05月25日上午17:24] 创建方法 by hw
 */
public class ProxyTest {

    public static void main(String[]args){
        UsersService user = new UsersServiceImpl();

        UsersService proxyUser = (UsersService) Proxy.newProxyInstance(UsersService.class.getClassLoader(),
                new Class[]{UsersService.class},
                new MyInvocationHandler(user));
        proxyUser.create();
    }
}
