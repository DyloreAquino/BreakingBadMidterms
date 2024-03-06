/**
	This is the Scene Canvas where every element is initialized and drawn using an Array List.
	
	@author Jerold Luther P. Aquino (230413)
    @author Hanzo Ricardo M. Castillo (231365)
	@version March 6, 2024
	
	I have not discussed the Java language code in my program 
	with anyone other than my instructor or the teaching assistants 
	assigned to this course.

	I have not used Java language code obtained from another student, 
	or any other unauthorized source, either modified or unmodified.

	If any Java language code or documentation used in my program 
	was obtained from another source, such as a textbook or website, 
	that has been clearly noted with a proper citation in the comments 
	of my program.
**/

import java.awt.*;
import javax.swing.*;
import java.util.*;

public class SceneCanvas extends JComponent{

    public int width;
    public int height;

    private Text text1, text2, text3;

    public ArrayList<DrawingObject> drawingObjects;
   

    public GrassBackground gbg1, gbg2, gbg3;
    public GrassMidground gmg1, gmg2, gmg3, gmg4, gmg5;
    public GrassOnground gog1, gog2, gog3, gog4, gog5;
    public GrassForeground gfg1, gfg2, gfg3, gfg4, gfg5;
    public Cloud cloud1, cloud2, cloud3, cloud4;
    
    public RV rv;

    public Random rand;

    /**
     * Constructor initializes the width, the height, and all drawingObjects needed
     * @param w width of the frame
     * @param h height of the frame
     */
    public SceneCanvas(int w, int h){
        width = w;
        height = h;

        rand = new Random();

        drawingObjects = new ArrayList<DrawingObject>();

        drawingObjects.add(new Background(w, 400));

        cloud1 = new Cloud(rand.nextInt(width) - width, rand.nextInt(100));
        cloud2 = new Cloud(rand.nextInt(width) - width, rand.nextInt(100));
        cloud3 = new Cloud(rand.nextInt(width) - width, rand.nextInt(100));
        cloud4 = new Cloud(rand.nextInt(width) - width, rand.nextInt(100));
        drawingObjects.add(cloud1);
        drawingObjects.add(cloud2);
        drawingObjects.add(cloud3);
        drawingObjects.add(cloud4);

        gbg1 = new GrassBackground(40, 310);
        gbg2 = new GrassBackground(430, 310);
        gbg3 = new GrassBackground(-300, 310);
        drawingObjects.add(gbg1);
        drawingObjects.add(gbg2);
        drawingObjects.add(gbg3);

        rv = new RV(-50, 50, 15); 
        drawingObjects.add(rv);

        gmg1 = new GrassMidground(width, 340, 0);
        gmg2 = new GrassMidground(width, 340, 1);
        gmg3 = new GrassMidground(width, 340, 2);
        gmg4 = new GrassMidground(width, 340, 3);
        gmg5 = new GrassMidground(width, 340, 4);
        drawingObjects.add(gmg1);
        drawingObjects.add(gmg2);
        drawingObjects.add(gmg3);
        drawingObjects.add(gmg4);
        drawingObjects.add(gmg5);

        drawingObjects.add(new MiddleGround(0, 0, w, h));

        gog1 = new GrassOnground(width, 550, 0);
        gog2 = new GrassOnground(width, 550, 1);
        gog3 = new GrassOnground(width, 550, 2);
        gog4 = new GrassOnground(width, 550, 3);
        gog5 = new GrassOnground(width, 550, 4);
        drawingObjects.add(gog1);
        drawingObjects.add(gog2);
        drawingObjects.add(gog3);
        drawingObjects.add(gog4);
        drawingObjects.add(gog5);

        drawingObjects.add(new OnGround(0, 0, w, h));

        gfg1 = new GrassForeground(-width, height, 0);
        gfg2 = new GrassForeground(-width, height, 1);
        gfg3 = new GrassForeground(-width, height, 2);
        gfg4 = new GrassForeground(-width, height, 3);
        gfg5 = new GrassForeground(-width, height, 4);
        drawingObjects.add(gfg1);
        drawingObjects.add(gfg2);
        drawingObjects.add(gfg3);
        drawingObjects.add(gfg4);
        drawingObjects.add(gfg5);

        text1 = new Text(1);
        text2 = new Text(2);
        text3 = new Text(3);
        drawingObjects.add(text1);
        drawingObjects.add(text2);
        drawingObjects.add(text3);
    }

    /**
     * Overrides the paintComponent method of the JComponent class to allow for drawing DrawingObjects
     */
    @Override
    protected void paintComponent(Graphics g){

        Graphics2D g2d = (Graphics2D) g;
        RenderingHints rh = new RenderingHints(
            RenderingHints.KEY_ANTIALIASING,
            RenderingHints.VALUE_ANTIALIAS_ON
        );
        g2d.setRenderingHints(rh);

        /**
         * Used a for loop for drawing all objects inside drawingObjects
         */
        for(DrawingObject obj: drawingObjects) {
            obj.draw(g2d);
        }
   
    }

    /**
     * Gets the RV object
     * @return the RV objects
     */
    public RV getRv(){

        return rv;
    }

    /**
     * Gets an array of all grasses in the foreground
     * @return an array of all grasses in the foreground
     */
    public ArrayList<GrassForeground> getFG() {

        ArrayList<GrassForeground> gfgObjects = new ArrayList<GrassForeground>();

        gfgObjects.add(gfg1);
        gfgObjects.add(gfg2);
        gfgObjects.add(gfg3);
        gfgObjects.add(gfg4);
        gfgObjects.add(gfg5);

        return gfgObjects;
    }

    /**
     * Gets an array of all grasses in the background
     * @return an array of all grasses in the background
     */
    public ArrayList<GrassBackground> getGBG() {

        ArrayList<GrassBackground> gbgObjects = new ArrayList<GrassBackground>();


        gbgObjects.add(gbg1);
        gbgObjects.add(gbg2);
        gbgObjects.add(gbg3);

        return gbgObjects;
    }

    /**
     * Gets an array of all grasses in the midground
     * @return an array of all grasses in the midground
     */
    public ArrayList<GrassMidground> getGMG() {

        ArrayList<GrassMidground> gmgObjects = new ArrayList<GrassMidground>();


        gmgObjects.add(gmg1);
        gmgObjects.add(gmg2);
        gmgObjects.add(gmg3);
        gmgObjects.add(gmg4);
        gmgObjects.add(gmg5);

        return gmgObjects;
    }

    /**
    * Gets an array of all grasses in the onground
    * @return an array of all grasses in the onground
    */
    public ArrayList<GrassOnground> getGOG() {

        ArrayList<GrassOnground> gogObjects = new ArrayList<GrassOnground>();

        gogObjects.add(gog1);
        gogObjects.add(gog2);
        gogObjects.add(gog3);
        gogObjects.add(gog4);
        gogObjects.add(gog5);
        return gogObjects;
    }

    /**
     * Gets an array of all clouds
     * @return an array of all clouds
     */
    public ArrayList<Cloud> getClouds() {

        ArrayList<Cloud> cloudObjects = new ArrayList<Cloud>();

        cloudObjects.add(cloud1);
        cloudObjects.add(cloud2);
        cloudObjects.add(cloud3);
        cloudObjects.add(cloud4);

        return cloudObjects;
    }
    
}
