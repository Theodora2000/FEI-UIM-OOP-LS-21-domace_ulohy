package sk.stuba.uim.fei.oop;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Frame83 extends JFrame implements ActionListener {

    public TestCanvas81 can;
    JPanel panel;
    JCheckBox red;
    JCheckBox green;
    JCheckBox blue;
    JButton setColor;
    String actColor;

    public Frame83(){
        super();


        panel = new JPanel();
        panel.setLayout(new FlowLayout());
        red = new JCheckBox("R");
        green = new JCheckBox("G");
        blue = new JCheckBox("B");
        setColor = new JButton("Set new Color");
        setColor.addActionListener(this);

        panel.add(red);
        panel.add(green);
        panel.add(blue);
        panel.add(setColor);
        add(BorderLayout.NORTH, panel);
        can = new TestCanvas81();
        add(BorderLayout.CENTER, can);

        setSize(480,482);
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
        if(e.getActionCommand().equals("Set new Color")){

            if(!(red.isSelected()) && !(green.isSelected()) && !(blue.isSelected())){
                can.setCurrentColor(Color.white);
                repaint();
            }
            else if((red.isSelected()) && (green.isSelected()) && (blue.isSelected())){
                can.setCurrentColor(Color.black);
                repaint();
            }
            else if((green.isSelected()) && (blue.isSelected())){
                can.setCurrentColor(Color.cyan);
                repaint();
            }
            else if((red.isSelected()) && (blue.isSelected())){
                can.setCurrentColor(Color.pink);
                repaint();
            }else if((red.isSelected()) && (green.isSelected()) ){
                can.setCurrentColor(Color.yellow);
                repaint();
            }

           else if(red.isSelected()){
                can.setCurrentColor(Color.red);
                repaint();
            }
            else if(green.isSelected()){
                can.setCurrentColor(Color.green);
                repaint();
            }
            else if(blue.isSelected()){
                can.setCurrentColor(Color.blue);
                repaint();
            }

        }
    }

}
