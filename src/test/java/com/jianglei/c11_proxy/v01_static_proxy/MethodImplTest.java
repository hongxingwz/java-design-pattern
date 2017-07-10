package com.jianglei.c11_proxy.v01_static_proxy;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * Created by jianglei on 17-7-10.
 */
public class MethodImplTest {

    @Test
    public void testStaticProxy() {
        Method method = new MethodImpl();
        MethodStaticProxy proxy = new MethodStaticProxy(method);

        proxy.method01();
        proxy.method02();

    }

    @Test
    public void testDymicProxy() {
        Method m = (Method)Proxy.newProxyInstance(
                Method.class.getClassLoader(),
                new Class[]{Method.class}, (proxy, method, args) -> {
                    MethodImpl methodImpl = new MethodImpl();
                    System.out.println("------- begin ------");
                    String name = method.getName();
                    System.out.println(name);
                    System.out.println(Arrays.toString(args));
                    System.out.println("method before");
                    switch (name) {
                        case "method01":
                            System.out.println("specfied method01 strong");
                            break;
                        case "method02":
                            System.out.println("specfied method02 strong");
                            break;
                        case "sayHello":
                            Object invoke = method.invoke(methodImpl, args);
                            StringBuilder sb = new StringBuilder();
                            sb.append("Dengyi ")
                                    .append(invoke)
                                    .append(" World");
                            return sb.toString();
                        default:
                            System.out.println("nonon!!!!");
                    }
                    method.invoke(methodImpl, args);
                    System.out.println("method after");
                    System.out.println("------- end --------");
                    System.out.println();
                    System.out.println();
                    return null;
                });

        m.method02();
        m.method01();
        String s = m.sayHello();
        Assert.assertEquals("Dengyi Hello World", s);

    }

    @Test
    public void testDynamicProxy2() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<?> proxyClass = Proxy.getProxyClass(Method.class.getClassLoader(),
                new Class[]{Method.class});

        System.out.println(proxyClass.getName());
        InvocationHandler handler = new InvocationHandler(){

            @Override
            public Object invoke(Object proxy, java.lang.reflect.Method method, Object[] args) throws Throwable {
                return null;
            }
        };

        Constructor<?> constructor = proxyClass.getConstructor(InvocationHandler.class);
        Method m = (Method)constructor.newInstance(handler);

    }
}
