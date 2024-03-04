import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;
import java.util.*;

public class SceneCanvas extends JComponent{

    public int width;
    public int height;
    public ArrayList<DrawingObject> drawingObjects;
    public ArrayList<Foreground> foregroundObjects;
    public RV rv;
    public Random rand;

    public SceneCanvas(int w, int h){
        width = w;
        height = h;
        rv = new RV(-50, 50, 3); 
        drawingObjects = new ArrayList<DrawingObject>();
        foregroundObjects = new ArrayList<Foreground>();
        rand = new Random();
        
        for (int i = 0; i < 5; i++) {
            foregroundObjects.add(new Foreground(-width - 300, height, rand.nextInt(5)))
        }

        drawingObjects.add(new Background(w, 400));
        drawingObjects.add(new GrassBackground(40, 310));
        drawingObjects.add(new GrassBackground(450, 310));
        drawingObjects.add(rv);
        drawingObjects.add(new MiddleGround(0, 0, w, h));
    }

    public void makeNewFG(){
            int state = rand.nextInt(5);
            foregroundObjects.add(new Foreground(-width, height, state));
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

        for (Foreground obj: foregroundObjects) {
            obj.draw(g2d);
        }
   
    }

    public RV getRv(){

        return rv;
    }

    public ArrayList<Foreground> getFG() {

        return foregroundObjects;

    }
    
}
