/**
	This is a class made for making the text seen in the animation
	
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

public class Text implements DrawingObject{

    /*
     * Drawing of text guided by these references:
     * - https://stackoverflow.com/questions/8802320/draw-text-with-graphics-object-on-jframe
     * - https://www.oreilly.com/library/view/learning-java/1565927184/ch17s06.html
     * - http://www.java2s.com/Tutorials/Java/Java_Swing/1520__Java_Swing_Font.htm
     */
    private Font font1 = new Font("Monospaced", Font.BOLD, 30);
    private Font font2 = new Font("Monospaced", Font.PLAIN, 24);
    private int state;

    /**
     * Constructor initializes state
     * the state determines which text to draw
     */
    public Text(int state){
        this.state = state;
    }

    /**
     * Draws necessary elements
     */
    public void draw(Graphics2D g2d){
        if (state == 1) {
            g2d.drawString("Press A or D to move", 100, 550);
        } else if (state == 2) {
            g2d.drawString("Press QWERTYU to play audio, 1234567 to stop audio correspondingly.", 100, 570);
        } else if (state == 3) {
            g2d.setColor(Color.WHITE);
            g2d.setFont(font1);
            g2d.drawString("Breaking Bad: The Java Desert Experience", 30, 50);
            g2d.setFont(font2);
            g2d.drawString("By Jerold Aquino and Hanzo Castillo", 30, 80);
        }
    }
}
