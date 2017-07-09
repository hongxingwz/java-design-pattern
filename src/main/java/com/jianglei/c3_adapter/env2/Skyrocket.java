package com.jianglei.c3_adapter.env2;

/**
 * Created by jianglei on 2017/7/9.
 */
public class Skyrocket {
    protected double simTime;

    private double mass;
    private double thrust;
    private double burnTime;

    public Skyrocket(double mass, double thrust, double burnTime) {
        this.mass = mass;
        this.thrust = thrust;
        this.burnTime = burnTime;
    }

    public double getMass() {
        return mass;
    }

    public double getThrust() {
        return thrust;
    }

    public void setSimTim(double t) {
        this.burnTime = t;
    }
}
