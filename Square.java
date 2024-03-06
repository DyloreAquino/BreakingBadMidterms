/**
	This is a class for a Square
	
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

public class Square implements DrawingObject{

    private double x, y, size;
    private Color color;

    /**
     * Constructor initializes Square parameters
     * @param x x coordinate
     * @param y y coordiate
     * @param size size of the square
     * @param color color of the square
     */
    public Square(double x, double y, double size, Color color){

        this.x = x;
        this.y = y;
        this.size = size;
        this.color = color;
    }

    /**
     * Draws necessary elements
     */
    public void draw(Graphics2D g2d){

        Rectangle2D.Double sqr = new Rectangle2D.Double(x, y, size, size);
        g2d.setColor(color);
        g2d.fill(sqr);

    }
    
}
