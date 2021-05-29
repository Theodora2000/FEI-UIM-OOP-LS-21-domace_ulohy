package sk.stuba.uim.fei.oop;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame81 extends JFrame implements ActionListener {


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

        setVisible(true);
    }

    public void paint(Graphics gr) {
        Color newC = new Color(redC,greenC,blueC);
        gr.setColor(newC);
        gr.drawLine(120,340,278,357);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("Set color")){

            redC = Integer.parseInt(red.getText());
            greenC = Integer.parseInt(green.getText());
            blueC = Integer.parseInt(blue.getText());
            repaint();
            System.out.println("RGB: "+redC+","+greenC+","+blueC);
        }
    }
}
