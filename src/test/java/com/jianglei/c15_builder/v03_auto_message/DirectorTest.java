package com.jianglei.c15_builder.v03_auto_message;

import org.junit.Test;

/**
 * Created by jianglei on 2017/7/10.
 */
public class DirectorTest {

    @Test
    public void testConstructor() {
        WelcomeBuilder welcomeBuilder = new WelcomeBuilder();
        GoodbyeBuilder goodbyeBuilder = new GoodbyeBuilder();
        Director director = new Director(welcomeBuilder);
        director.constructor("jianglei", "dengyi");
        System.out.println("------");
        Director director1 = new Director(goodbyeBuilder);
        director1.constructor("dengyi", "jianglei");

    }
}
