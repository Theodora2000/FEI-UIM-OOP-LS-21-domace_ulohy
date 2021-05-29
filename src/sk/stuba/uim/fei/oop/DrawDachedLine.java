package sk.stuba.uim.fei.oop;
//treba ispraviit nesto


import java.awt.*;

public class DrawDachedLine {

    private int x;
    private int y;
    private int x1;
    private int y1;

    public DrawDachedLine(int x, int y, int x1, int y1){
        this.x=0;
        this.y = 0;
        this.x1 = 0;
        this.y1=0;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

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

    void drawDashedLines(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        float[] dashingPattern1 = {2f, 2f};
        Stroke stroke1 = new BasicStroke(2f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_MITER, 1.0f, dashingPattern1, 2.0f);
        g2d.setStroke(stroke1);
        g2d.setColor(Color.MAGENTA);
        g2d.drawLine(x,y,x1,y1);
    }
}
