import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;
import java.util.Random;

public class GrassOnground implements DrawingObject{

    public int x, y, state;

    public Color grassColor = new Color(164, 119, 62);

    public Random rand;

    public GrassOnground(int x, int y, int state){
        rand = new Random();
        this.x = rand.nextInt(800) - x;
        this.y = y;
        this.state = state;
    }

    public void moveRight() {
        x += 6;
    } 

    public void resetPosition() {
        x = rand.nextInt(800) - 800;
    }

    public int getXValue() {
        return x;
    }

    public void draw(Graphics2D g2d){

        AffineTransform reset = g2d.getTransform();

        Path2D.Double grass1 = new Path2D.Double();
        grass1.moveTo(x, y);
        grass1.curveTo(x + 35, y - 19, x + 67, y - 89, x + 16, y - 236);

        Path2D.Double grass2 = new Path2D.Double();
        grass2.moveTo(x, y);
        grass2.curveTo(x - 12, y - 34, x - 64, y - 65, x - 46, y - 410);

        Path2D.Double grass3 = new Path2D.Double();
        grass3.moveTo(x, y);
        grass3.curveTo(x + 13, y - 40, x + 120, y - 58, x + 57, y - 39);

        Path2D.Double grass4 = new Path2D.Double();
        grass4.moveTo(x, y);
        grass4.curveTo(x - 57, y - 34, x + 5, y - 50, x - 15, y - 318);

        Path2D.Double grass5 = new Path2D.Double();
        grass5.moveTo(x, y);
        grass5.curveTo(x + 57, y - 43, x -34, y - 71, x - 75, y - 261);

        g2d.setStroke(new BasicStroke(4));
        g2d.setColor(grassColor);

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
        return "GrassMidground";
    }
}
