package com.jianglei.c8_singleton.env1;

/**
 * Created by jianglei on 2017/7/9.
 */
public class Factory2 {
    private static Factory2 factory;

    private Factory2() {

    }

    public static Factory2 getFactory() {
        if (factory == null) {
            factory = new Factory2();
        }

        return factory;
    }
}
