import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;
import java.util.Random;

public class Cloud implements DrawingObject{
    public int x, y, size;

    public Random rand;

    public Color colorCloud = new Color(165, 157, 180);

    public Circle circle1, circle2, circle3;

    public Cloud(int x, int y) {
        rand = new Random();
        this.x = x + rand.nextInt(40);
        this.y = y + rand.nextInt(40);
        size = rand.nextInt(4);
    }

    public void moveRight() {
        x += 1;
    } 

    public void resetPosition() {
        x = rand.nextInt(800) - 800;
        y = rand.nextInt(100);
    }

    public int getXValue() {
        return x;
    }

    public void draw(Graphics2D g2d){
        circle1 = new Circle(x - 10, y + 31, 10 * size, colorCloud);
        circle1.draw(g2d);

        circle2 = new Circle(x + 30, y + 13, 20 * size, colorCloud);
        circle2.draw(g2d);

        circle3 = new Circle(x -5, y + 20, 15 * size, colorCloud);
        circle3.draw(g2d);
        
    }
}
