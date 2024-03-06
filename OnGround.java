/**
	This is a class for making the actual ground of the animation. 
    (Basically a ground closer to us than the middleground but farther than the foreground)
	
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

public class OnGround implements DrawingObject {
    public int x, y, width, height;

    public Rectangle middleGround;

    public Color groundColor = new Color(189, 145, 88);

    /**
     * Constructor initializes the position and the size of the ground
     * @param x x coordinate
     * @param y y coordinate
     * @param width width of the ground
     * @param height height of the ground
     */
    public OnGround(int x, int y, int width, int height){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    /**
     * Draws the necessary elements
     */
    public void draw(Graphics2D g2d){
        middleGround = new Rectangle(x + 0, y + 500, width, height, groundColor);
        middleGround.draw(g2d);
    }

}
