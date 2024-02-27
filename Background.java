import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

public class Background implements DrawingObject{
    
    public int width, height;
    public Rectangle sky;
    public Rectangle ground;

    public Color emptyColor = new Color(0, 0, 0);
    public Color skyColor1 = new Color(96, 89, 107);
    public Color skyColor2 = new Color(47, 57, 118);
    public Color groundColor = new Color(195, 155, 104);
    
    public Background(int width, int height){
        this.width = width;
        this.height = height;
    }

    public void draw(Graphics2D g2d){

        AffineTransform reset = g2d.getTransform();

        sky = new Rectangle(0, 0, width, height, width/2, height, skyColor1, width/2, 0, skyColor2);
        sky.drawGrad(g2d);

        ground = new Rectangle(0, 330, width, 400, groundColor);
        ground.draw(g2d);
        
    }
}
