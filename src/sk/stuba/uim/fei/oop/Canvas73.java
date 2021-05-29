package sk.stuba.uim.fei.oop;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

public class Canvas73 extends Canvas implements MouseMotionListener, MouseListener {

    public ArrayList<DrawLine> our_lines = new ArrayList<DrawLine>();
    DrawLine actLine;
    int xpos= 0, ypos =0;
    private boolean right_clicked=false;

    public Canvas73(){
        super();
        addMouseListener(this);
        addMouseMotionListener(this);
    }


    @Override
    public void paint(Graphics g) {
        for(DrawLine l : our_lines){
            l.drLine(g);
        }
        if(actLine!=null){
            actLine.drLine(g);
        }
    }

    @Override
    public void mouseDragged(MouseEvent e) {

        int dx = e.getX();
        int dy = e.getY();

        if (right_clicked) {
            if (actLine != null) {
                actLine.setX2(xpos);
                actLine.setY2(ypos);
                repaint();
            }

        } else {

            if (actLine != null) {
                actLine.setX2(dx);
                actLine.setY2(dy);
                repaint();
            }
        }
        right_clicked=false;
    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

        if(e.getButton() == MouseEvent.BUTTON3){

            right_clicked=true;
        }

            xpos = e.getX();
            ypos = e.getY();
            actLine = new DrawLine(xpos, ypos, xpos, ypos, Color.red);

    }

    @Override
    public void mouseReleased(MouseEvent e) {
        our_lines.add(actLine);
        repaint();
        actLine = null;

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
