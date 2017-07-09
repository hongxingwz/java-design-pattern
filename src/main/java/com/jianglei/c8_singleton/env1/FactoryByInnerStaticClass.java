package com.jianglei.c8_singleton.env1;

/**
 * Created by jianglei on 2017/7/9.
 */
public class FactoryByInnerStaticClass {

    private static class FactoryHolder{
        private static FactoryByInnerStaticClass factory = new FactoryByInnerStaticClass();

    }

    public static FactoryByInnerStaticClass getFactory() {
        return FactoryHolder.factory;
    }


}
