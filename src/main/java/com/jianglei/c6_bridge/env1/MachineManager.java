package com.jianglei.c6_bridge.env1;

/**
 * Created by jianglei on 2017/7/9.
 */
public interface MachineManager {
    void startMachine();

    void stopMachine();

    void startProcess();

    void stopProcess();

    void conveyIn();

    void conveyOut();

    void shutdown();
}
