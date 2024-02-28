import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

public class GrassBackground implements DrawingObject{

    public int x, y;

    public Color grassColor = new Color(194, 154, 106);

    public GrassBackground(int x, int y){
        this.x = x;
        this.y = y + 6;
    }

    public void draw(Graphics2D g2d){

        AffineTransform reset = g2d.getTransform();

        Path2D.Double grass1 = new Path2D.Double();
        grass1.moveTo(x, y + 20);
        grass1.curveTo(x + 6, y + 14, x + 13, y + 8, x + 30, y + 3);

        Path2D.Double grass2 = new Path2D.Double();
        grass2.moveTo(x, y + 20);
        grass2.curveTo(x + 2, y + 17, x - 4, y + 7, x - 7, y + 2);

        Path2D.Double grass3 = new Path2D.Double();
        grass3.moveTo(x, y + 20);
        grass3.curveTo(x + 2, y + 14, x + 10, y + 7, x + 5, y + 3);

        Path2D.Double grass4 = new Path2D.Double();
        grass4.moveTo(x, y + 20);
        grass4.curveTo(x + 2, y + 14, x + 10, y + 7, x -20, y + 1);


        g2d.setStroke(new BasicStroke(1));
        g2d.setColor(grassColor);
        g2d.draw(grass1);
        g2d.translate(-10, 0);
        g2d.draw(grass2);
        g2d.translate(-20, 0);
        g2d.draw(grass3);
        g2d.translate(40, -4);
        g2d.draw(grass4);
        g2d.translate(40, 2);
        g2d.draw(grass2);
        g2d.draw(grass1);
        g2d.setTransform(reset);
        g2d.translate(-40, 10);
        g2d.draw(grass1);
        g2d.setTransform(reset);
        g2d.translate(120, -3);
        g2d.draw(grass3);
        g2d.translate(-40, 0);
        g2d.draw(grass2);
        g2d.translate(20, 10);
        g2d.draw(grass4);
        g2d.translate(50, -4);
        g2d.draw(grass1);
        g2d.translate(50, -2);
        g2d.draw(grass2);
        g2d.setTransform(reset);
        g2d.translate(195, 0);
        g2d.draw(grass1);
        g2d.translate(30, 0);
        g2d.draw(grass3);
        g2d.translate(50, 5);
        g2d.draw(grass4);
        g2d.draw(grass1);


        g2d.setTransform(reset);
    }
}
