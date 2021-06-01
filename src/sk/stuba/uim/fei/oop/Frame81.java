package sk.stuba.uim.fei.oop;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Frame81 extends JFrame implements ActionListener {

    public TestCanvas81 can;
    JTextField red;
    JTextField green;
    JTextField blue;
    JPanel colors;
    JButton col;
    int redC;
    int greenC;
    int blueC;
    public int getRedC() {
        return redC;
    }

    public int getGreenC() {
        return greenC;
    }

    public int getBlueC() {
        return blueC;
    }

    public Frame81(){
        super();
        this.redC = 146;
        this.greenC = 0;
        this.blueC=0;
        setSize(480,480);
        setLayout(new BorderLayout());


        red = new JTextField();
        red.setText("0");
        green = new JTextField();
        green.setText("0");
        blue = new JTextField();
        blue.setText("0");

        col = new JButton("Set color");
        col.addActionListener(this);


        colors = new JPanel();
        colors.setLayout(new GridLayout(1,0));
        colors.add(red);
        colors.add(green);
        colors.add(blue);
        colors.add(col);

        add(BorderLayout.NORTH, colors);
        can = new TestCanvas81();
        add(BorderLayout.CENTER,can);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("Set color")){
            can.setCurrentColor(new Color(Integer.parseInt(red.getText()), Integer.parseInt(green.getText()),Integer.parseInt(blue.getText()) ));
        }
    }
}
