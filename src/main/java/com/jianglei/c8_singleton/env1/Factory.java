package com.jianglei.c8_singleton.env1;

/**
 * Created by jianglei on 2017/7/9.
 */
public class Factory {
    private static Factory factory = new Factory();
    private Factory() {
    }

    public static Factory getFactory() {
        return factory;
    }
}
