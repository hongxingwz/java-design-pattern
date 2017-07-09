package com.jianglei.c15_builder.v03_auto_message;

import java.util.Date;

/**
 * Created by jianglei on 2017/7/10.
 */
public abstract class AutoMessage {
    private String to;

    private String from;

    private String subject;

    private String body;

    private Date sendDate;

    public void send() {
        System.out.println("to: " + to);
        System.out.println("from: " + from);
        System.out.println("subject: " + subject);
        System.out.println("body: " + body);
        System.out.println("sendDate: " + sendDate);
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Date getSendDate() {
        return sendDate;
    }

    public void setSendDate(Date sendDate) {
        this.sendDate = sendDate;
    }
}
