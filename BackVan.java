import java.awt.*;
import java.awt.geom.*;

public class BackVan implements DrawingObject{
    
    double x1, x2, x3bezer, x4bezer, x5, y1, y2, y3bezer, y4bezer, y5;
    Color color;

    public BackVan(double x1, double x2, double x3bezer, double x4bezer, double x5, double y1, double y2, double y3bezer, double y4bezer, double y5, Color color){

        this.x1 = x1;
        this.x2 = x2;
        this.x3bezer = x3bezer;
        this.x4bezer = x4bezer;
        this.x5 = x5;
        this.y1 = y1;
        this.y2 = y2;
        this.y3bezer = y3bezer;
        this.y4bezer = y4bezer;
        this.y5 = y5;
        this.color = color;


    }

    public void draw(Graphics2D g2d){

        Path2D.Double BackVan = new Path2D.Double();
        BackVan.moveTo(x1, y1);
        BackVan.lineTo(x2, y2);
        BackVan.curveTo(x3bezer, y3bezer, x4bezer, y4bezer, x5, y5);
        BackVan.closePath();
        g2d.setColor(color);
        g2d.fill(BackVan);

    }
    
    public String getType(){

        return "BackVan";

    }
}