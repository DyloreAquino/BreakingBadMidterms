import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;
import java.util.*;

public class SceneCanvas extends JComponent{

    public int width;
    public int height;
    public ArrayList<DrawingObject> drawingObjects;
    public RV rv;
    public Foreground fg;

    public SceneCanvas(int w, int h){
        width = w;
        height = h;
        rv = new RV(-50, 50, 3); 
        fg = new Foreground(0, h);
        drawingObjects = new ArrayList<DrawingObject>();
        drawingObjects.add(new Background(w, 400));
        drawingObjects.add(new GrassBackground(40, 310));
        drawingObjects.add(new GrassBackground(450, 310));
        drawingObjects.add(rv);
        drawingObjects.add(new MiddleGround(0, 0, w, h));
        drawingObjects.add(fg);
    }

    public void makeNewFG(){
        if (fg.getXValue() == width) {
            fg = null;
            fg = new Foreground(-width, height);
            drawingObjects.add(fg);
        }
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

    public RV getRv(){

        return rv;
    }

    public Foreground getFG() {

        return fg;

    }
    
}
