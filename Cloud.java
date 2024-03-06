/**
	This is a class made for drawing a cloud.
	
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
import java.util.Random;

public class Cloud implements DrawingObject{
    public int x, y, size;

    public Random rand;

    public Color colorCloud = new Color(165, 157, 180);

    public Circle circle1, circle2, circle3;

    /**
     * Constructor initializes the position
     * @param x x coordinate
     * @param y y coordinate
     */
    public Cloud(int x, int y) {
        rand = new Random();
        this.x = x + rand.nextInt(40);
        this.y = y + rand.nextInt(40);
        size = rand.nextInt(4);
    }

    /**
     * Moves right the cloud by 1 x value.
     */
    public void moveRight() {
        x += 1;
    } 

    /**
     * Resets the position to somewhere within the bounds on
     * the left side of the screen
     */
    public void resetPosition() {
        x = rand.nextInt(800) - 800;
        y = rand.nextInt(100);
    }

    /**
     * Gets the x coordinate of the cloud
     * @return the x coordinate
     */
    public int getXValue() {
        return x;
    }

    /**
     * Draws the necessary elements
     */
    public void draw(Graphics2D g2d){
        circle1 = new Circle(x - 10, y + 31, 10 * size, colorCloud);
        circle1.draw(g2d);

        circle2 = new Circle(x + 30, y + 13, 20 * size, colorCloud);
        circle2.draw(g2d);

        circle3 = new Circle(x -5, y + 20, 15 * size, colorCloud);
        circle3.draw(g2d);
        
    }
}
