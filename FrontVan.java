/**
	This is a class made for drawing the Front of the Van as seen in class RV
    This objects is similar to a triangle class.
	
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

public class FrontVan implements DrawingObject{
    
    double x1, x2, x3, y1, y2, y3;
    Color color;

    /**
     * Constructor initializes the needed attributes
     * @param x1 the first x value
     * @param x2 the second x value
     * @param x3 the third x value
     * @param y1 the first y value
     * @param y2 the second y value
     * @param y3 the third y value
     * @param color the color of the front of the van
     */
    public FrontVan(double x1, double x2, double x3, double y1, double y2, double y3, Color color){

        this.x1 = x1;
        this.x2 = x2;
        this.x3 = x3;
        this.y1 = y1;
        this.y2 = y2;
        this.y3 = y3;
        this.color = color;

    }

    /**
     * Draws the necessary elements
     */
    public void draw(Graphics2D g2d){

        Path2D.Double frontVan = new Path2D.Double();
        frontVan.moveTo(x1, y1);
        frontVan.lineTo(x2, y2);
        frontVan.lineTo(x3, y3);
        frontVan.closePath();
        g2d.setColor(color);
        g2d.fill(frontVan);

    }

}
