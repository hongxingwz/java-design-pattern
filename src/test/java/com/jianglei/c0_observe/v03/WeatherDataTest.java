package com.jianglei.c0_observe.v03;

import org.junit.Test;

/**
 * Created by jianglei on 2017/7/9.
 */
public class WeatherDataTest {

    @Test
    public void testMeasurementsChange() {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay c = new CurrentConditionsDisplay(weatherData);

        weatherData.setData(20, 10, 8);

    }
}
