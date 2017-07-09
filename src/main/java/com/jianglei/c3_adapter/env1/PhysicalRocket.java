package com.jianglei.c3_adapter.env1;

/**
 * Created by jianglei on 2017/7/9.
 */
public class PhysicalRocket {
    private double burnArea;
    private double burnRate;
    private double fuelMass;
    private double totalMass;

    public PhysicalRocket(double burnArea, double burnRate, double fuelMass, double totalMass) {
        this.burnArea = burnArea;
        this.burnRate = burnRate;
        this.fuelMass = fuelMass;
        this.totalMass = totalMass;
    }

    public double getBurnTIme() {
        return this.burnArea;
    }

    public double getMass(double t) {
        return t;
    }

    public double geThrust(double t) {
        return t;
    }
}
