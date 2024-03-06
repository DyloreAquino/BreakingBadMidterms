/**
	This is a template for a Java file.
	
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

public class BackVan implements DrawingObject{
    
    double x1, x2, x3bezier, x4bezier, x5, y1, y2, y3bezier, y4bezier, y5;
    Color color;

    /**
     * Constructor initializes parameters.
     * @param x1 The initial x value
     * @param x2 The x coordinate drawn the line to
     * @param x3bezier The x coordinate of the first bezier
     * @param x4bezier The x coordinate of the second bezier
     * @param x5 The last x value
     * @param y1 The initial y value
     * @param y2 The y coordinate drawn the line to
     * @param y3bezier The y coordinate of the first bezier
     * @param y4bezier The y coordinate of the second bezier
     * @param y5 The last y value
     * @param color The color of the back of the van
     */
    public BackVan(double x1, double x2, double x3bezier, double x4bezier, double x5, double y1, double y2, double y3bezier, double y4bezier, double y5, Color color){

        this.x1 = x1;
        this.x2 = x2;
        this.x3bezier = x3bezier;
        this.x4bezier = x4bezier;
        this.x5 = x5;
        this.y1 = y1;
        this.y2 = y2;
        this.y3bezier = y3bezier;
        this.y4bezier = y4bezier;
        this.y5 = y5;
        this.color = color;
    }

    /**
     * Draws the necessary elements.
     */
    public void draw(Graphics2D g2d){

        Path2D.Double BackVan = new Path2D.Double();
        BackVan.moveTo(x1, y1);
        BackVan.lineTo(x2, y2);
        BackVan.curveTo(x3bezier, y3bezier, x4bezier, y4bezier, x5, y5);
        BackVan.closePath();
        g2d.setColor(color);
        g2d.fill(BackVan);

    }

}