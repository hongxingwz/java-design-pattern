package com.jianglei.c15_builder.v03_auto_message;

/**
 * Created by jianglei on 2017/7/10.
 */
public class WelcomeBuilder extends Builder {

    public WelcomeBuilder() {
        msg = new WelcomeMessage();
    }

    @Override
    public void buildSubject() {
        msg.setSubject("welcome title");
    }

    @Override
    public void buildBody() {
        msg.setBody("welcome body");
    }
}
