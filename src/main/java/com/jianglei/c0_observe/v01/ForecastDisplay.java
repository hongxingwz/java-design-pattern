package com.jianglei.c0_observe.v01;

/**
 * Created by jianglei on 2017/7/9.
 */
public class ForecastDisplay {
    private double temp;
    private double humidity;
    private double pressure;



    public ForecastDisplay() {

    }



    public void update(double temp, double humidity, double pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;

        display();
    }

    public void display() {
        System.out.println("Forecast");
        System.out.println("temp:   " + temp);
        System.out.println("humidity:    " + humidity);
        System.out.println("pressure:   " + pressure);
        System.out.println("-----------------");
    }
}
