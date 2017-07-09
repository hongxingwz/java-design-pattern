package com.jianglei.c3_adapter.env2;

/**
 * Created by jianglei on 2017/7/9.
 */
public class OozinozSkyrocket extends Skyrocket {
    private PhysicalRocket rocket;

    public OozinozSkyrocket(PhysicalRocket r) {
        super(
                r.getMass(0),
                r.geThrust(0),
                r.getBurnTIme());
        rocket = r;
    }

    public double getMass() {
        return rocket.getMass(simTime);
    }

    public double getThrust() {
        return rocket.geThrust(simTime);
    }
}
