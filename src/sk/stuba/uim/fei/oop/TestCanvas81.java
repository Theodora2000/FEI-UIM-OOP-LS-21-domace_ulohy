package sk.stuba.uim.fei.oop;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

public class TestCanvas81 extends Canvas implements MouseListener, MouseMotionListener {

    private Color currentColor;

    public Color getCurrentColor() {
        return currentColor;
    }

    public void setCurrentColor(Color currentColor) {
        this.currentColor = currentColor;
    }

    ArrayList<DrawLine> our_lines = new ArrayList<DrawLine>();
    DrawLine actLine;
    int xpos  = 0, ypos = 0;

    public TestCanvas81(){
        super();
        addMouseListener(this);
        addMouseMotionListener(this);
    }


    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        xpos = e.getX();
        ypos = e.getY();
        actLine = new DrawLine(xpos, ypos, xpos, ypos, currentColor);
        repaint();
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

    @Override
    public void mouseDragged(MouseEvent e) {
        int xp = e.getX();
        int yp = e.getY();
        if(actLine!=null){
            actLine.setX2(xp);
            actLine.setY2(yp);
            repaint();
        }
    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }

    public void paint(Graphics g){
        for(DrawLine a : our_lines){
            a.drLine(g);
        }
        if(actLine!=null ){
            actLine.drLine(g);
        }
    }
}
