package com.jianglei.c0_observe.v03;

import java.util.Observable;

/**
 * Created by jianglei on 2017/7/9.
 */
public class WeatherData extends Observable {
    private double temperature;
    private double h;
    private double pressure;

    public void setData(double temperature, double h, double pressure) {
        this.temperature = temperature;
        this.h = h;
        this.pressure = pressure;

        setChanged();
        measurementsChanged();
    }
    public void measurementsChanged() {
        notifyObservers();
    }

    public double getTemperature() {
        return temperature;
    }

    public double getH() {
        return h;
    }

    public double getPressure() {
        return pressure;
    }
}
