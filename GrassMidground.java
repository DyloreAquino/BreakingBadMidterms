/**
	This is class made for drawing the grasses located in the midground.
	
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

public class GrassMidground implements DrawingObject{

    public int x, y, state;

    public Color grassColor = new Color(190, 150, 100);

    public Random rand;

    /**
     * Constructor initializes the position and state
     * @param x the x coordinate
     * @param y the y coordinate
     * @param state which grass to spawn
     */
    public GrassMidground(int x, int y, int state){
        rand = new Random();
        this.x = rand.nextInt(800) - x;
        this.y = y;
        this.state = state;
    }

    /**
     * moves the grass right
     */
    public void moveRight() {
        x += 5;
    } 

    /**
     * resets the position to a random position to the left of the screen
     */
    public void resetPosition() {
        x = rand.nextInt(800) - 800;
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
        grass1.moveTo(x, y);
        grass1.curveTo(x + 35, y + 19, x + 67, y + 89, x + 16, y + 136);

        Path2D.Double grass2 = new Path2D.Double();
        grass2.moveTo(x, y);
        grass2.curveTo(x - 12, y + 34, x - 64, y + 65, x - 46, y + 110);

        Path2D.Double grass3 = new Path2D.Double();
        grass3.moveTo(x, y);
        grass3.curveTo(x + 13, y + 40, x + 120, y + 58, x + 57, y + 89);

        Path2D.Double grass4 = new Path2D.Double();
        grass4.moveTo(x, y);
        grass4.curveTo(x - 57, y + 34, x + 5, y + 50, x - 15, y + 118);

        Path2D.Double grass5 = new Path2D.Double();
        grass5.moveTo(x, y);
        grass5.curveTo(x + 57, y + 43, x -34, y + 71, x - 75, y + 61);

        g2d.setStroke(new BasicStroke(3));
        g2d.setColor(grassColor);

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
