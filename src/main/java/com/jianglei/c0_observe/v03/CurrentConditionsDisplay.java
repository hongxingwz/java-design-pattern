package com.jianglei.c0_observe.v03;

import com.jianglei.c0_observe.v02.DisplayElement;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by jianglei on 2017/7/9.
 */
public class CurrentConditionsDisplay implements  Observer, DisplayElement{
    private double t;
    private double h;
    private double p;

    private Observable o;

    public CurrentConditionsDisplay(Observable o) {
        this.o = o;
        o.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("CurrentConditions display: ");
        System.out.println("temperature: " + t);
        System.out.println("h:  " + h);
        System.out.println("pressure: " + p);
        System.out.println("------------------------");

    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            t = weatherData.getTemperature();
            h = weatherData.getH();
            p = weatherData.getPressure();

            display();
        }

    }
}
