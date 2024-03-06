/**
	This is class made for drawing the grasses located in the foreground.
	
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
import java.awt.geom.*;
import java.util.Random;

public class GrassForeground implements DrawingObject{

    public int x, y, state;
    public Random rand;

    public Color foregroundColor = new Color(108, 63, 22);

    /**
     * Constructor initializes the position and state
     * @param x the x coordinate
     * @param y the y coordinate
     * @param state which grass to spawn
     */
    public GrassForeground(int x, int y, int state){
        rand = new Random();
        this.x = rand.nextInt(800) - x;
        this.y = y;
        this.state = state;
        // "state" feature with assistance from Martin Darius Alba
    }

    /**
     * moves the grass right
     */
    public void moveRight() {
        x += 12;
    }

    /**
     * resets the position to a random position to the left of the screen
     */
    public void resetPosition() {
        x = rand.nextInt(800) - 1200;
    }

    /**
     * Gets the x coordinate
     * @return the x coordinate
     */
    public int getXValue() {

        return x;
        
    }

    /**
     * Draws the necessary elements
     */
    public void draw(Graphics2D g2d){

        AffineTransform reset = g2d.getTransform();

        Path2D.Double grass1 = new Path2D.Double();
        grass1.moveTo(x - 200, y + 600);
        grass1.curveTo(x + 142, y - 58, x + 134, y - 262, x + 101, y - 310);
        
        Path2D.Double grass2 = new Path2D.Double();
        grass2.moveTo(x - 200, y + 600);
        grass2.curveTo(x - 158, y - 58, x - 200, y - 262, x - 1, y - 285);

        Path2D.Double grass3 = new Path2D.Double();
        grass3.moveTo(x - 200, y + 600);
        grass3.curveTo(x + 328, y - 140, x + 376, y - 457, x + 143, y - 251);

        Path2D.Double grass4 = new Path2D.Double();
        grass4.moveTo(x - 200, y + 600);
        grass4.curveTo(x + 328, y - 140, x + 466, y - 280, x + 647, y - 206);

        Path2D.Double grass5 = new Path2D.Double();
        grass5.moveTo(x - 200, y + 600);
        grass5.curveTo(x + 102, y - 87, x + 157, y - 153, x + 100, y - 233);

        g2d.setStroke(new BasicStroke(5));
        g2d.setColor(foregroundColor);
        
        /*
         * A switch case is made which is based on state,
         * The state determines which grass to draw.
         */
        switch (state) {
            case 0:
                g2d.draw(grass1);
                break;
            case 1:
                g2d.draw(grass2);
                break;
            case 2:
                g2d.draw(grass3);
                break;
            case 3:
                g2d.draw(grass4);
                break;
            case 4:
                g2d.draw(grass5);
                break;
        }

        g2d.setTransform(reset);
    }
    
}
