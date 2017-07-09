package com.jianglei.c8_singleton.env1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by jianglei on 2017/7/9.
 */
public class FactoryTest {

    @Test
    public void testGetFactory() {
        Factory factory = Factory.getFactory();
        Factory factory1 = Factory.getFactory();
        assertEquals(factory.hashCode(), factory1.hashCode());
    }
}
