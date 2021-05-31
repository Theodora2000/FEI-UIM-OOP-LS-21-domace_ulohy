package sk.stuba.uim.fei.oop;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class Canvas7 extends Canvas implements MouseListener, MouseMotionListener {

  private int x;
  private int y;
  private int height;
  private int width;

  public Canvas7(){

      this.x = -1;
      this.y = -1;
      this.height = -1;
      this.width = -1;
      addMouseListener(this);
      addMouseMotionListener(this);

  }

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

    @Override
    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void paint(Graphics g){
      g.setColor(Color.blue);
      g.drawOval(x,y,width,height);
    }


    @Override
    public void mouseClicked(MouseEvent e) {

      int x1 = e.getX();
      int y1 = e.getY();
      JFrame novy = new JFrame();
      novy.setSize(150, 150);

      JTextField coordinates = new JTextField();
      coordinates.setSize(10, 10);
      coordinates.setText(x1 + "," + y1);

      novy.add(coordinates);
      novy.setVisible(true);
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

    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }
}
