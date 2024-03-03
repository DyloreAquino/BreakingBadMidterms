import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

public class Foreground implements DrawingObject{

    public int x, y;

    public Color foregroundColor = new Color(108, 63, 22);

    public Foreground(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void moveRight() {

        x += 5;

    }

    public int getXValue() {

        return x;
        
    }

    public void draw(Graphics2D g2d){

        AffineTransform reset = g2d.getTransform();

        Path2D.Double grass1 = new Path2D.Double();
        grass1.moveTo(x + 0, y + 600);
        grass1.curveTo(x + 142, y - 58, x + 134, y - 262, x + 101, y - 310);
        
        Path2D.Double grass2 = new Path2D.Double();
        grass2.moveTo(x + 300, y + 600);
        grass2.curveTo(x + 142, y - 58, x + 100, y - 262, x + 299, y - 285);

        Path2D.Double grass3 = new Path2D.Double();
        grass3.moveTo(x + 465, y + 600);
        grass3.curveTo(x + 628, y - 140, x + 676, y - 457, x + 443, y - 251);

        Path2D.Double grass4 = new Path2D.Double();
        grass4.moveTo(x + 720, y + 600);
        grass4.curveTo(x + 628, y - 140, x + 766, y - 280, x + 947, y - 206);

        Path2D.Double grass5 = new Path2D.Double();
        grass5.moveTo(x + 474, y + 600);
        grass5.curveTo(x + 402, y - 87, x + 457, y - 153, x + 400, y - 233);

        g2d.setStroke(new BasicStroke(5));
        g2d.setColor(foregroundColor);
        g2d.draw(grass1);
        g2d.draw(grass2);
        g2d.draw(grass3);
        g2d.draw(grass4);
        g2d.draw(grass5);

        g2d.setTransform(reset);
    }

    
}
