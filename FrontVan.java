import java.awt.*;
import java.awt.geom.*;

public class FrontVan implements DrawingObject{
    
    double x1, x2, x3, y1, y2, y3;
    Color color;

    public FrontVan(double x1, double x2, double x3, double y1, double y2, double y3, Color color){

        this.x1 = x1;
        this.x2 = x2;
        this.x3 = x3;
        this.y1 = y1;
        this.y2 = y2;
        this.y3 = y3;
        this.color = color;


    }

    public void draw(Graphics2D g2d){

        Path2D.Double frontVan = new Path2D.Double();
        frontVan.moveTo(x1, y1);
        frontVan.lineTo(x2, y2);
        frontVan.lineTo(x3, y3);
        frontVan.closePath();
        g2d.setColor(color);
        g2d.fill(frontVan);

    }
    
    public String getType(){

        return "FrontVan";

    }

}
