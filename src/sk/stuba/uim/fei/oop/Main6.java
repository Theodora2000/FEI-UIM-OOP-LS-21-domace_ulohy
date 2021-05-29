package sk.stuba.uim.fei.oop;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Main6 {
    public static void main(String args[]){
        JFrame f = new JFrame();
        f.setSize(400,400);
        f.setLayout(new BorderLayout());
       /* JPanel  p = new JPanel();
        p.add(new Canvas6());*/
        f.add(BorderLayout.CENTER,new Canvas6());
        JPanel  p1 = new JPanel();
        p1.setLayout(new FlowLayout());
        JButton b1 = new JButton("Tlacidlo 1");
        JButton b2 = new JButton("Tlacidlo 2");
        JButton b3 = new JButton("Tlacidlo 3");
        JButton b4 = new JButton("Tlacidlo 4");
        p1.add(b1);
        p1.add(b2);
        p1.add(b3);
        p1.add(b4);
        f.add(BorderLayout.NORTH,p1);
        JPanel  p2 = new JPanel();

        p2.setLayout(new GridLayout(1,2));
        JButton m1 = new JButton("OK");
        JButton m2 = new JButton("CANCLE");
        p2.add(m1);
        p2.add(m2);
        f.add(BorderLayout.SOUTH,p2);


        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        f.setVisible(true);
    }
}
