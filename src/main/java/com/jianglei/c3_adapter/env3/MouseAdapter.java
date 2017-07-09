package com.jianglei.c3_adapter.env3;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * Created by jianglei on 2017/7/9.
 */
public class MouseAdapter implements MouseListener{

    public void mouseClicked(MouseEvent e) {
        System.out.println("mouseClicked event");
    }

    public void mousePressed(MouseEvent e) {
        System.out.println("mousePressed event");
    }

    public void mouseReleased(MouseEvent e) {
        System.out.println("mouse released event");
    }

    public void mouseEntered(MouseEvent e) {
        System.out.println("mouse entered event");
    }

    public void mouseExited(MouseEvent e) {
        System.out.println("mouse exited event");
    }
}
