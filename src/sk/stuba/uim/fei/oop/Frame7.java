package sk.stuba.uim.fei.oop;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Frame7 extends JFrame implements ActionListener{

    JButton close;
    JButton draw;
    JButton click;
    JPanel buttons;
    public Canvas7 can;
    private boolean clicked=false;
    private boolean clicked_draw=false;


    public Frame7(){
        super();

        setLayout(new BorderLayout());

        close = new JButton("Close");
        draw = new JButton("Draw");
        click = new JButton("Click");

        close.addActionListener(this);
        draw.addActionListener(this);
        click.addActionListener(this);

        buttons = new JPanel();
        buttons.setLayout(new GridLayout(0,1));
        buttons.add(close);
        buttons.add(draw);
        buttons.add(click);

        add(BorderLayout.WEST, buttons);
        can = new Canvas7();
        add(BorderLayout.CENTER, can);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        setSize(300,300);
        setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("Close")){
            dispose();
            System.exit(0);
        }
        if(e.getActionCommand().equals("Draw")){
            if(!clicked_draw) {
                if(can!=null) {
                    can.setX(150);
                    can.setY(250);
                    can.setWidth(100);
                    can.setHeight(100);
                    can.repaint();
                }
                validate();
            }

        }
        if(e.getActionCommand().equals("Click")){
           clicked= true;

        }

    }

}
