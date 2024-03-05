import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;
import java.util.Random;

public class GrassForeground implements DrawingObject{

    public int x, y, state;
    public Random rand;

    public Color foregroundColor = new Color(108, 63, 22);

    public GrassForeground(int x, int y, int state){
        rand = new Random();
        this.x = rand.nextInt(800) - x;
        this.y = y;
        this.state = state;
        // "state" feature with assistance from Martin Darius Alba
    }

    public void moveRight() {
        x += 8;
    }

    public void resetPosition() {
        x = rand.nextInt(800) - 1200;
    }

    public int getXValue() {

        return x;
        
    }

    public void draw(Graphics2D g2d){

        AffineTransform reset = g2d.getTransform();

        Path2D.Double grass1 = new Path2D.Double();
        grass1.moveTo(x - 200, y + 600);
        grass1.curveTo(x + 142, y - 58, x + 134, y - 262, x + 101, y - 310);
        
        Path2D.Double grass2 = new Path2D.Double();
        grass2.moveTo(x - 200, y + 600);
        grass2.curveTo(x - 158, y - 58, x - 200, y - 262, x - 1, y - 285);

        Path2D.Double grass3 = new Path2D.Double();
        grass3.moveTo(x - 200, y + 600);
        grass3.curveTo(x + 328, y - 140, x + 376, y - 457, x + 143, y - 251);

        Path2D.Double grass4 = new Path2D.Double();
        grass4.moveTo(x - 200, y + 600);
        grass4.curveTo(x + 328, y - 140, x + 466, y - 280, x + 647, y - 206);

        Path2D.Double grass5 = new Path2D.Double();
        grass5.moveTo(x - 200, y + 600);
        grass5.curveTo(x + 102, y - 87, x + 157, y - 153, x + 100, y - 233);

        g2d.setStroke(new BasicStroke(5));
        g2d.setColor(foregroundColor);
        
        switch (state) {
            case 0:
                g2d.draw(grass1);
                break;
            case 1:
                g2d.draw(grass2);
                break;
            case 2:
                g2d.draw(grass3);
                break;
            case 3:
                g2d.draw(grass4);
                break;
            case 4:
                g2d.draw(grass5);
                break;
        }

        g2d.setTransform(reset);
    }
    
    public String getType() {
        return "Foreground";
    }
}
