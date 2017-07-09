package com.jianglei.c15_builder.v03_auto_message;

import java.util.Date;

/**
 * Created by jianglei on 2017/7/10.
 */
public abstract class Builder {
    protected AutoMessage msg;

    public abstract void buildSubject();

    public abstract void buildBody();

    public void buildTo(String to) {
        msg.setTo(to);
    }

    public void buildFrom(String from) {
        msg.setFrom(from);
    }

    public void buildSendDate(){
        msg.setSendDate(new Date());
    }

    public void sendMessage(){
        msg.send();
    }
}
