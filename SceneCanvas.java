import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;
import java.util.*;

public class DrawingCanvas extends JComponent{

    public int width;
    public int height;
    public ArrayList<DrawingObject> drawingObjects;

    public DrawingCanvas(int w, int h){
        width = w;
        height = h;
        drawingObjects = new ArrayList<DrawingObject>();
        drawingObjects.add(new Background(w, 400));
        drawingObjects.add(new RV(-50, 50, 3));
        
    }

    @Override
    protected void paintComponent(Graphics g){

        Graphics2D g2d = (Graphics2D) g;
        RenderingHints rh = new RenderingHints(
            RenderingHints.KEY_ANTIALIASING,
            RenderingHints.VALUE_ANTIALIAS_ON
        );

        g2d.setRenderingHints(rh);
        
        for (DrawingObject obj: drawingObjects){
            obj.draw(g2d);
        }
   
    }
    
}
