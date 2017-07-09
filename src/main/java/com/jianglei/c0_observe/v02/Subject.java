package com.jianglei.c0_observe.v02;

/**
 * Created by jianglei on 2017/7/9.
 */
public interface Subject {

    void registerObserver(Observer o);

    void removeObserver(Observer o);

    void notifyObservers();
}
