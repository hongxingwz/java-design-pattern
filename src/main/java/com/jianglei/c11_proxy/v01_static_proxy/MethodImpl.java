package com.jianglei.c11_proxy.v01_static_proxy;

/**
 * Created by jianglei on 17-7-10.
 */
public class MethodImpl implements Method {
    @Override
    public void method01() {
        System.out.println("MethodImpl.method01");
    }

    @Override
    public void method02() {
        System.out.println("MethodImpl.method02");
    }

    public String sayHello() {
        String hello = "Hello";
        return hello;
    }
}
