package com.jianglei.c6_bridge.env1;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by jianglei on 2017/7/9.
 */
public class MachineManageTest {
    private MachineManager fuserManager;
    private StarPressManager starPressManager;

    @Before
    public void init() {
        fuserManager = new FuserManager(
                new FuserController());

        starPressManager = new StarPressManager(
                new StarPressController());

    }
    @Test
    public void testShutdown() {
        fuserManager.shutdown();
        System.out.println();
        starPressManager.shutdown();
    }
}
