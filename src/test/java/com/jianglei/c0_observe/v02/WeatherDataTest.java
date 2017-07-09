package com.jianglei.c0_observe.v02;

import org.junit.Test;

/**
 * Created by jianglei on 2017/7/9.
 */
public class WeatherDataTest {

    @Test
    public void testMeasurementsChanged() {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay =
                        new CurrentConditionsDisplay(weatherData);
        new ForecastDisplay(weatherData);
        new StatisticsDisplay(weatherData);
        new HeatIndexDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}
