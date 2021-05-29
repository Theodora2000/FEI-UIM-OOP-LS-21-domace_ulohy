package sk.stuba.uim.fei.oop;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Frame82 extends JFrame implements ActionListener , ItemListener {

    private boolean selectedChoice;
    JPanel colorsChoice;
    Choice pickColor;
    String c[] ={"red", "blue", "green", "cyan"};
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

    public Frame82(){
        super();
        this.redC = 146;
        this.greenC = 0;
        this.blueC=0;
        setSize(480,480);
        setLayout(new BorderLayout());
        selectedChoice = false;

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

        colorsChoice = new JPanel();

        pickColor = new Choice();
        for(int i=0;i<c.length;i++){
            pickColor.add(c[i]);
        }
        pickColor.addItemListener(this);
        colorsChoice.add(pickColor);

        add(BorderLayout.WEST, colorsChoice);
        add(BorderLayout.NORTH, colors);

        setVisible(true);
    }

    public void paint(Graphics gr) {
        if(selectedChoice){
            if(pickColor.getSelectedItem().equals("red")) {
                gr.setColor(Color.red);
            }else if(pickColor.getSelectedItem().equals("blue")){
                gr.setColor(Color.blue);
            }
            else if(pickColor.getSelectedItem().equals("green")){
                gr.setColor(Color.green);
            }else{
                gr.setColor(Color.cyan);
            }

            selectedChoice=false;
        }else {
            Color newC = new Color(redC, greenC, blueC);
            gr.setColor(newC);
        }
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


    @Override
    public void itemStateChanged(ItemEvent e) {
        if(e.getSource() == pickColor){
            selectedChoice=true;
            repaint();
        }
    }
}
