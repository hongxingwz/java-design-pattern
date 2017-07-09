package com.jianglei.c8_singleton.env1;

/**
 * Created by jianglei on 2017/7/9.
 */
public class Factory3 {
    private static Factory3 factory;
    private static Class<Factory3> lockClass = Factory3.class;
    private Factory3() {}

    public static Factory3 getFactory() {
        if (factory == null) {
            synchronized (lockClass) {
                if (factory == null) {
                    factory = new Factory3();
                }
            }
        }

        return factory;
    }
}
