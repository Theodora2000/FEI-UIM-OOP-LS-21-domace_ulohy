package sk.stuba.uim.fei.oop;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Frame83 extends JFrame implements ActionListener {

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


        setSize(480,482);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        setVisible(true);
    }

    public void paint(Graphics g){
       if(actColor.equals("red")){
           g.setColor(Color.red);
       }else if(actColor.equals("green")){
           g.setColor(Color.green);
       }else if(actColor.equals("blue")){
           g.setColor(Color.blue);
       } else if(actColor.equals("black")){
           g.setColor(Color.black);
       } else if(actColor.equals("cyan")){
           g.setColor(Color.cyan);
       }
       else if(actColor.equals("pink")){
           g.setColor(Color.pink);
       }
       else if(actColor.equals("yellow")){
           g.setColor(Color.yellow);
       }
       else if(actColor.equals("white")){
           g.setColor(Color.white);
       }

        g.fillOval(200,200,100,100);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("Set new Color")){

            if(!(red.isSelected()) && !(green.isSelected()) && !(blue.isSelected())){
                actColor = "white";
                repaint();
            }
            else if((red.isSelected()) && (green.isSelected()) && (blue.isSelected())){
                actColor = "black";
                repaint();
            }
            else if((green.isSelected()) && (blue.isSelected())){
                actColor = "cyan";
                repaint();
            }
            else if((red.isSelected()) && (blue.isSelected())){
                actColor = "pink";
                repaint();
            }else if((red.isSelected()) && (green.isSelected()) ){
                actColor = "yellow";
                repaint();
            }

           else if(red.isSelected()){
                actColor = "red";
                repaint();
            }
            else if(green.isSelected()){
                actColor = "green";
                repaint();
            }
            else if(blue.isSelected()){
                actColor = "blue";
                repaint();
            }

        }
    }

}
