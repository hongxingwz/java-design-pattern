package com.jianglei.c6_bridge.env1;

/**
 * Created by jianglei on 2017/7/9.
 */
public class StarPressManager implements MachineManager {

    private StarPressController controller;

    public StarPressManager(StarPressController controller) {
        this.controller = controller;
    }

    public void startMachine() {
        controller.start();
    }

    public void stopMachine() {
        controller.stop();
    }

    public void startProcess() {
        controller.startProcess();
    }

    public void stopProcess() {
        controller.endProcess();
    }

    public void conveyIn() {
        controller.index();
    }

    public void conveyOut() {
        controller.discharge();
    }

    public void shutdown() {
        startProcess();
        conveyOut();
        stopMachine();
    }
}
