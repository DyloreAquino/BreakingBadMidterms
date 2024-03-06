/**
	This is a class for making lines.
	
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

public class Line implements DrawingObject{

    private double x1, y1, x2, y2;
    private int thickness;
    private Color color;

    /**
     * Constructor initializes the attributes of the line
     * @param x1 The x value of the first point
     * @param y1 The y value of the first point
     * @param x2 The x value of the second point
     * @param y2 The y value of the second point
     * @param thickness The thickness of the line
     * @param color The color of the line
     */
    public Line(double x1, double y1, double x2, double y2, int thickness, Color color){

        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.thickness = thickness;
        this.color = color;
    }

    /**
     * Draws the necessary elements
     */
    public void draw(Graphics2D g2d){

        
        Line2D.Double ln = new Line2D.Double(x1, y1, x2, y2);
        g2d.setStroke(new BasicStroke(thickness));
        g2d.setColor(color);
        g2d.draw(ln);
        

    }
    
}