package com.jianglei.c0_observe.v02;

/**
 * Created by jianglei on 2017/7/9.
 */
public interface Observer {
    void update(float temp, float humidity, float pressure);
}
