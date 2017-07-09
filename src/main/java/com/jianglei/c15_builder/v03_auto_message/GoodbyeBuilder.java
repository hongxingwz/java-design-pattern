package com.jianglei.c15_builder.v03_auto_message;

/**
 * Created by jianglei on 2017/7/10.
 */
public class GoodbyeBuilder extends Builder {

    public GoodbyeBuilder() {
        msg = new GoodbyeMessage();
    }

    @Override
    public void buildSubject() {
        msg.setSubject("good bye message title");
    }

    @Override
    public void buildBody() {
        msg.setBody("good bye message body");
    }
}
