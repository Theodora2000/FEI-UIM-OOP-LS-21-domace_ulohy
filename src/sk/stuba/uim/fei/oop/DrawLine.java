package sk.stuba.uim.fei.oop;



import java.awt.*;


public class DrawLine {

    private int x;
    private int y;
    private int x2;
    private int y2;
    Color color;

    public DrawLine(int x, int y, int x2, int y2, Color c){
        this.x = x;
        this.y = y;
        this.x2 = x2;
        this.y2 = y2;
        color = c;
    }

    public void drLine(Graphics g){
        /*float[] dashingPattern1 = {2f, 2f};
            Stroke stroke1 = new BasicStroke(2f, BasicStroke.CAP_BUTT,
                    BasicStroke.JOIN_MITER, 1.0f, dashingPattern1, 2.0f);

            g2d.setStroke(stroke1);
            g2d.drawLine(120, 50, 360, 50);*/

        g.setColor(color);
        g.drawLine(this.x,this.y, this.x2, this.y2);
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

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
