package com.jianglei.c15_builder.v03_auto_message;

/**
 * Created by jianglei on 2017/7/10.
 */
public class Director {
    Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void constructor(String toAddress, String fromAddress) {
        this.builder.buildTo(toAddress);
        this.builder.buildFrom(fromAddress);
        builder.buildBody();
        builder.buildSendDate();
        builder.buildSubject();

        builder.sendMessage();
    }
}
