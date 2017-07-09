package com.jianglei.c8_singleton.env1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by jianglei on 2017/7/9.
 */
public class Factory3Test {

    @Test
    public void testGetFactory() {
        Factory3 factory = Factory3.getFactory();
        Factory3 factory1 = Factory3.getFactory();
        assertEquals(factory, factory1);
    }
}
