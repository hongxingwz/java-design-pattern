package com.jianglei.c15_builder.v01_by_cnblogs;

/**
 * Created by jianglei on 2017/7/10.
 */
public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void constructor() {
        builder.buildPart1();
        builder.buildPart2();
    }
}
