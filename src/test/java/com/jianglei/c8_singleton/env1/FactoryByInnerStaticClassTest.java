package com.jianglei.c8_singleton.env1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by jianglei on 2017/7/9.
 */
public class FactoryByInnerStaticClassTest {

    @Test
    public void testGetFactory() {
        FactoryByInnerStaticClass factory = FactoryByInnerStaticClass.getFactory();
        FactoryByInnerStaticClass factory1 = FactoryByInnerStaticClass.getFactory();
        assertEquals(factory.hashCode(), factory1.hashCode());
    }
}
