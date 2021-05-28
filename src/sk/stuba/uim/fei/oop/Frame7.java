package sk.stuba.uim.fei.oop;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Frame7 extends JFrame implements ActionListener, MouseListener {

    JButton close;
    JButton draw;
    JButton click;
    JPanel buttons;
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
        addMouseListener(this);

        buttons = new JPanel();
        buttons.setLayout(new GridLayout(0,1));
        buttons.add(close);
        buttons.add(draw);
        buttons.add(click);


        add(BorderLayout.WEST, buttons);

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
                add(BorderLayout.CENTER, new Canvas7());
                validate();
            }

        }
        if(e.getActionCommand().equals("Click")){
           clicked= true;
        }

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(clicked) {
            int x = e.getX();
            int y = e.getY();
            JFrame novy = new JFrame();
            novy.setSize(150, 150);

            JTextField coordinates = new JTextField();
            coordinates.setSize(10, 10);
            coordinates.setText(x + "," + y);

            novy.add(coordinates);
            novy.setVisible(true);
            clicked=false;
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
