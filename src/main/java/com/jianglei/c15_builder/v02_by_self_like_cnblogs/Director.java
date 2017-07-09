package com.jianglei.c15_builder.v02_by_self_like_cnblogs;

/**
 * Created by jianglei on 2017/7/10.
 */
public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void builder() {
        builder.builderPart1();
        builder.builderPart2();
    }
}
