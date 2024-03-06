/**
	This is a interface for all DrawingObjects.
	
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

public interface DrawingObject {

    /**
     * All elements must have a draw method, to draw the necessary elements
     * @param g2d The Graphics2D object to be used in drawing the elements
     */
    public void draw(Graphics2D g2d);
    
}
