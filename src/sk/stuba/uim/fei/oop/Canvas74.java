package sk.stuba.uim.fei.oop;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class Canvas74 extends Canvas implements MouseListener, MouseMotionListener {

    private int x;
    private int y;
    private int x1;
    private int y1;

    @Override
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    @Override
    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public Canvas74(){
        super();
        this.x=-1;
        this.y=-1;
        this.x1=-1;
        this.y1=-1;
        addMouseListener(this);
        addMouseMotionListener(this);
    }

    void drawDashedLines(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;

        g2d.drawLine(120, 50, 360, 50);



    }

    @Override
    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
         float[] dashingPattern1 = {2f, 2f};
         Stroke stroke1 = new BasicStroke(2f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_MITER, 1.0f, dashingPattern1, 2.0f);

            g2d.setStroke(stroke1);


        g2d.setColor(Color.MAGENTA);
        g2d.drawLine(x,y,x1,y1);
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        x = e.getX();
        y = e.getY();
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        repaint();
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {
       setX1(e.getX());
       setY1(e.getY());
       repaint();
    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }


}
