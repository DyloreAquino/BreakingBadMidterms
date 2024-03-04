import java.awt.*;
import java.awt.geom.*;

public class Rectangle implements DrawingObject{

    private double x, y, width, height;
    private Color color;
    private Color color1, color2;
    private int val1, val2, val3, val4;
    private GradientPaint skyGradientPaint;

    public Rectangle(double x, double y, double width, double height, Color color){
        
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.color = color;

    }

    public Rectangle(double x, double y, double width, double height, 
                    int val1, int val2, Color color1, int val3, int val4, Color color2){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.val1 = val1;
        this.val2 = val2;
        this.val3 = val3;
        this.val4 = val4;
        this.color1 = color1;
        this.color2 = color2;
        // GradientPaint learned from https://www.youtube.com/watch?v=0Oil0CdXsuI
    }



    public void draw(Graphics2D g2d){

        Rectangle2D.Double rec = new Rectangle2D.Double(x, y, width, height);
        g2d.setColor(color);
        g2d.fill(rec);

    }
    
    public void drawGrad(Graphics2D g2d) {
        // With Assistance from Martin Darius Alba
        Rectangle2D.Double rec = new Rectangle2D.Double(x, y, width, height);
        skyGradientPaint = new GradientPaint(val1, val2, color1, val3, val4, color2);
        g2d.setPaint(skyGradientPaint);
        g2d.fill(rec);
    }

    public String getType() {
        return "Rectangle";
    }
}
