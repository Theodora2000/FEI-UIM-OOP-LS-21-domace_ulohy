package sk.stuba.uim.fei.oop;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Arrays;

public class Frame84 extends JFrame implements ActionListener {

    JTextArea string;
    String old;
    String n;
    char[] A;
    JTextArea converted_string;
    JButton finish;
    JPanel panel;
    private int len;

    public Frame84(){
        super();
        string = new JTextArea("Enter string");
        converted_string = new JTextArea("Converted string");
        converted_string.setEditable(false);
        finish = new JButton("Click to convert");
        finish.addActionListener(this);
        panel = new JPanel();
        panel.add(string);
        panel.add(converted_string);
        panel.add(finish);
        add(panel);
        pack();

        addWindowFocusListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        setSize(480,100);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("Click to convert")){
            old = string.getText();
            A = old.toCharArray();
            len = A.length;
            int i=0;

            while(i<(len/2)){
                char tmp = A[i];
                A[i] = A[len-i-1];
                A[len-i-1] = tmp;
                i++;
            }

            n= String.valueOf(A);


            converted_string.setText(n);

        }
    }
}
