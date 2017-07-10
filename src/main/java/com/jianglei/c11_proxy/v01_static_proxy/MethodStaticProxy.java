package com.jianglei.c11_proxy.v01_static_proxy;

/**
 * Created by jianglei on 17-7-10.
 */
public class MethodStaticProxy implements Method {
    private Method method;

    public MethodStaticProxy(Method method) {
        this.method = method;
    }

    @Override
    public void method01() {
        System.out.println("Method.method02 before");
        method.method01();
        System.out.println("Method.method02 after");
    }

    @Override
    public void method02() {
        System.out.println("Method.method02 before");
        method.method02();
        System.out.println("Method.method02 after");
    }

    public String sayHello() {
        String hello = "Hello";
        return hello;
    }
}
