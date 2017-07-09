package com.jianglei.c3_adapter.env1;

/**
 * Created by jianglei on 2017/7/9.
 */
public class OozinozRocket extends PhysicalRocket implements RocketSim {
    private double time;

    public OozinozRocket(double burnArea, double burnRate, double fuelMass, double totalMass) {
        super(burnArea, burnRate, fuelMass, totalMass);
    }

    public double getMass() {
        return super.getMass(time);
    }

    public double getThrust() {
        return super.geThrust(time);
    }

    public void setSimTIme(double time) {
        this.time = time;
    }
}
