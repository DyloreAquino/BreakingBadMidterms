/**
    The class for the background of the animation.
	
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

public class Background implements DrawingObject{
    
    public int width, height;
    public Rectangle sky;
    public Rectangle ground;

    public Color emptyColor = new Color(0, 0, 0);
    public Color skyColor1 = new Color(96, 89, 107);
    public Color skyColor2 = new Color(47, 57, 118);
    public Color groundColor = new Color(195, 155, 104);


    /**
     * Constructor initializes width and height.
     * @param width the width of the background.
     * @param height the height of the background.
     */
    public Background(int width, int height){
        this.width = width;
        this.height = height;
    }

    /**
     * Draws the necessary elements, such as the sky and ground.
     */
    public void draw(Graphics2D g2d){

        AffineTransform reset = g2d.getTransform();

        sky = new Rectangle(0, 0, width, height, width/2, height, skyColor1, width/2, 0, skyColor2);
        sky.drawGrad(g2d);

        ground = new Rectangle(0, 330, width, 400, groundColor);
        ground.draw(g2d);

        g2d.setTransform(reset);
        
    }
}
