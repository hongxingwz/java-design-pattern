package com.jianglei.c6_bridge.env1;

/**
 * Created by jianglei on 2017/7/9.
 */
public class FuserManager implements MachineManager {
    private FuserController controller;

    public FuserManager(FuserController controller) {
        this.controller = controller;
    }

    public void startMachine() {
        controller.startMachine();
    }

    public void stopMachine() {
        controller.stopMachine();
    }

    public void startProcess() {
        controller.begin();
    }

    public void stopProcess() {
        controller.end();
    }

    public void conveyIn() {
        controller.conveyIn();
    }

    public void conveyOut() {
        controller.conveyOut();
    }

    public void shutdown() {
        startProcess();
        conveyOut();
        stopMachine();
    }
}
