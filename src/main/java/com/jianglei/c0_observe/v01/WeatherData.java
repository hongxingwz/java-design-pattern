package com.jianglei.c0_observe.v01;

/**
 * Created by jianglei on 2017/7/9.
 */
public class WeatherData {
    private CurrentConditionDisplay currentConditionDisplay;
    private StaticsDisplay staticsDisplay;
    private ForecastDisplay forecastDisplay;

    private double temperature;
    private double humidity;
    private double pressure;

    public WeatherData(
            CurrentConditionDisplay currentConditionDisplay,
            StaticsDisplay staticsDisplay,
            ForecastDisplay forecastDisplay) {

        this.currentConditionDisplay = currentConditionDisplay;
        this.staticsDisplay = staticsDisplay;
        this.forecastDisplay = forecastDisplay;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getHumidity() {
        return humidity;
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }

    public double getPressure() {
        return pressure;
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
    }

    public void measurementsChanged() {
        currentConditionDisplay.update(getTemperature(), getHumidity(), getPressure());
        staticsDisplay.update(getTemperature(), getHumidity(), getPressure());
        forecastDisplay.update(getTemperature(), getHumidity(), getPressure());
    }
}
