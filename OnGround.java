import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

public class OnGround implements DrawingObject {
    public int x, y, width, height;

    public Rectangle middleGround;

    public Color groundColor = new Color(164, 121, 67);

    public OnGround(int x, int y, int width, int height){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public void draw(Graphics2D g2d){
        middleGround = new Rectangle(x + 0, y + 500, width, height, groundColor);
        middleGround.draw(g2d);
    }

    public String getType() {
        return "MiddleGround";
    }
}
