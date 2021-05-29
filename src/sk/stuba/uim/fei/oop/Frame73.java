package sk.stuba.uim.fei.oop;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Frame73 extends JFrame {

    public Frame73(){
        super();
        setSize(680,480);
        setLayout(new BorderLayout());
        setBackground(Color.GREEN);
        add(BorderLayout.CENTER, new Canvas73());
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        setVisible(true);
    }
}
