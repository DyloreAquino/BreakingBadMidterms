import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;
import java.util.*;

public class SceneCanvas extends JComponent{

    public int width;
    public int height;

    public ArrayList<DrawingObject> drawingObjects;
    public ArrayList<GrassForeground> gfgObjects;
    public ArrayList<GrassMidground> gmgObjects;
    public ArrayList<GrassBackground> gbgObjects;
    public ArrayList<GrassOnground> gogObjects;
    public ArrayList<Cloud> cloudObjects;
    
    public RV rv;

    public Random rand;

    public SceneCanvas(int w, int h){
        width = w;
        height = h;
        rv = new RV(-50, 50, 3, 10); 
        drawingObjects = new ArrayList<DrawingObject>();
        gfgObjects = new ArrayList<GrassForeground>();
        gmgObjects = new ArrayList<GrassMidground>();
        gbgObjects = new ArrayList<GrassBackground>();
        gogObjects = new ArrayList<GrassOnground>();
        cloudObjects = new ArrayList<Cloud>();
        rand = new Random();

        gogObjects.add(new GrassOnground(width, 550, 0));
        gogObjects.add(new GrassOnground(width, 550, 1));
        gogObjects.add(new GrassOnground(width, 550, 2));
        gogObjects.add(new GrassOnground(width, 550, 3));
        gogObjects.add(new GrassOnground(width, 550, 4));

        gmgObjects.add(new GrassMidground(width, 340, 0));
        gmgObjects.add(new GrassMidground(width, 340, 1));
        gmgObjects.add(new GrassMidground(width, 340, 2));
        gmgObjects.add(new GrassMidground(width, 340, 3));
        gmgObjects.add(new GrassMidground(width, 340, 4));

        gbgObjects.add(new GrassBackground(40, 310));
        gbgObjects.add(new GrassBackground(430, 310));
        gbgObjects.add(new GrassBackground(-300, 310));

        gfgObjects.add(new GrassForeground(-width, height, 0));
        gfgObjects.add(new GrassForeground(-width, height, 1));
        gfgObjects.add(new GrassForeground(-width, height, 2));
        gfgObjects.add(new GrassForeground(-width, height, 3));
        gfgObjects.add(new GrassForeground(-width, height, 4));

        cloudObjects.add(new Cloud(rand.nextInt(800) - 800, rand.nextInt(100)));
        cloudObjects.add(new Cloud(rand.nextInt(800) - 800, rand.nextInt(100)));
        cloudObjects.add(new Cloud(rand.nextInt(800) - 800, rand.nextInt(100)));
        cloudObjects.add(new Cloud(rand.nextInt(800) - 800, rand.nextInt(100)));

        drawingObjects.add(new Background(w, 400));
        drawingObjects.add(rv);
        drawingObjects.add(new MiddleGround(0, 0, w, h));
        drawingObjects.add(new OnGround(0, 0, w, h));
    }

    @Override
    protected void paintComponent(Graphics g){

        Graphics2D g2d = (Graphics2D) g;
        RenderingHints rh = new RenderingHints(
            RenderingHints.KEY_ANTIALIASING,
            RenderingHints.VALUE_ANTIALIAS_ON
        );
        g2d.setRenderingHints(rh);

        drawingObjects.get(0).draw(g2d);

        for (Cloud obj: cloudObjects) {
            obj.draw(g2d);
        }
        
        for (GrassBackground obj: gbgObjects) {
            obj.draw(g2d);
        }

        drawingObjects.get(1).draw(g2d);
        drawingObjects.get(2).draw(g2d);

        for (GrassMidground obj: gmgObjects) {
            obj.draw(g2d);
        }

        for (GrassOnground obj: gogObjects) {
            obj.draw(g2d);
        }

        drawingObjects.get(3).draw(g2d);

        for (GrassForeground obj: gfgObjects){
            obj.draw(g2d);
        }
   
    }

    public RV getRv(){

        return rv;
    }

    public ArrayList<GrassForeground> getFG() {

        return gfgObjects;
    }

    public ArrayList<GrassBackground> getGBG() {

        return gbgObjects;
    }

    public ArrayList<GrassMidground> getGMG() {

        return gmgObjects;
    }

    public ArrayList<GrassOnground> getGOG() {

        return gogObjects;
    }

    public ArrayList<Cloud> getClouds() {

        return cloudObjects;
    }
    
}
