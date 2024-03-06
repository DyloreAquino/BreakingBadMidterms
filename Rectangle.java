/**
	This is a class for making a Rectangle.
	
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

public class Rectangle implements DrawingObject{

    private double x, y, width, height;
    private Color color;
    private Color color1, color2;
    private int val1, val2, val3, val4;
    private GradientPaint skyGradientPaint;

    /**
     * Constructor initializes attributes of the Rectangle
     * @param x x coordinate
     * @param y y coordinate
     * @param width width of the rect
     * @param height height of the rect
     * @param color color of the rect
     */
    public Rectangle(double x, double y, double width, double height, Color color){
        
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.color = color;

    }

    /**
     * Constructor initializes attributes for the Rectangle
     * This is a special constructor created for drawing a rect with a Gradient
     * @param x x coordinate
     * @param y y coordinate
     * @param width width of the rect
     * @param height height rect
     * @param val1 x coordinate for starting point of gradient
     * @param val2 y coordinate for starting point of gradient
     * @param color1 first color of gradient
     * @param val3 x coordinate for final point of gradient
     * @param val4 y coordinate for final point of gradient
     * @param color2 second color of gradient
     */
    public Rectangle(double x, double y, double width, double height, 
                    int val1, int val2, Color color1, int val3, int val4, Color color2){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.val1 = val1;
        this.val2 = val2;
        this.val3 = val3;
        this.val4 = val4;
        this.color1 = color1;
        this.color2 = color2;
        // GradientPaint learned from https://www.youtube.com/watch?v=0Oil0CdXsuI
    }


    /**
     * Draws necessary elements
     */
    public void draw(Graphics2D g2d){

        Rectangle2D.Double rec = new Rectangle2D.Double(x, y, width, height);
        g2d.setColor(color);
        g2d.fill(rec);

    }
    
    /**
     * Draws necessary elements, but with Gradient
     * @param g2d Graphics2D object to be used
     */
    public void drawGrad(Graphics2D g2d) {
        // With Assistance from Martin Darius Alba
        Rectangle2D.Double rec = new Rectangle2D.Double(x, y, width, height);
        skyGradientPaint = new GradientPaint(val1, val2, color1, val3, val4, color2);
        g2d.setPaint(skyGradientPaint);
        g2d.fill(rec);
    }

}
