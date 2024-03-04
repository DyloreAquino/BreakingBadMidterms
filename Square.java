import java.awt.*;
import java.awt.geom.*;

public class Square implements DrawingObject{

    private double x, y, size;
    private Color color;

    public Square(double x, double y, double size, Color color){

        this.x = x;
        this.y = y;
        this.size = size;
        this.color = color;
    }

    public void draw(Graphics2D g2d){

        Rectangle2D.Double sqr = new Rectangle2D.Double(x, y, size, size);
        g2d.setColor(color);
        g2d.fill(sqr);

    }

    public String getType() {
        return "Square";
    }
    
}
