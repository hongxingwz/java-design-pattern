package com.jianglei.c8_singleton.env1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by jianglei on 2017/7/9.
 */
public class Factory2Test {

    @Test
    public void testGetFactory() {
        Factory2 factory = Factory2.getFactory();
        Factory2 factory1 = Factory2.getFactory();
        assertEquals(factory.hashCode(), factory1.hashCode());
    }
}
