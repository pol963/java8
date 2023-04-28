package ch06_07;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AnonymousClass01 {
    public static void main(String[] args) {
        Button b = new Button();
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                System.out.println("ActionEvent occurred");
            }
        });
    }
}


