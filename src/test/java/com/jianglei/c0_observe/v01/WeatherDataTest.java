package com.jianglei.c0_observe.v01;

import org.junit.Test;

/**
 * Created by jianglei on 2017/7/9.
 */
public class WeatherDataTest {

    @Test
    public void testMeasurementsChange() {
        WeatherData weatherData = new WeatherData(
                new CurrentConditionDisplay(),
                new StaticsDisplay(),
                new ForecastDisplay()
        );

        weatherData.setHumidity(20.0f);
        weatherData.setPressure(21.0f);
        weatherData.setTemperature(22.0f);
        weatherData.measurementsChanged();
    }
}
