package sk.stuba.uim.fei.oop;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Frame82 extends JFrame implements ActionListener , ItemListener {

    private boolean selectedChoice;
    public TestCanvas81 can;
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
        can = new TestCanvas81();
        add(BorderLayout.CENTER, can);

        add(BorderLayout.SOUTH, colorsChoice);
        add(BorderLayout.NORTH, colors);
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

            can.setCurrentColor(new Color((Integer.parseInt(red.getText())), Integer.parseInt(green.getText()),Integer.parseInt(blue.getText())));
            repaint();

        }
    }


    @Override
    public void itemStateChanged(ItemEvent e) {
        if(e.getSource() == pickColor){
            if(pickColor.getSelectedItem().equals("red")){
                can.setCurrentColor(Color.red);
            }else if(pickColor.getSelectedItem().equals("green")){
                can.setCurrentColor(Color.green);
            }
            else if(pickColor.getSelectedItem().equals("blue")){
                can.setCurrentColor(Color.blue);
            }
            else if(pickColor.getSelectedItem().equals("cyan")){
                can.setCurrentColor(Color.cyan);
            }
            repaint();
        }
    }
}
