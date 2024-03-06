/**
	This is the scene Frame where all events are handled and the GUI is setup.
    The keylisteners for both audio and movement are handled here.
    The actionlistener for the timer of the animation are also handled here.
	
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
import java.awt.event.*;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.*;

public class SceneFrame {

    private JFrame frame;
    private SceneCanvas sceneCanvas;
    private ArrayList<GrassForeground> gfgObjects;
    private ArrayList<GrassBackground> gbgObjects;
    private ArrayList<GrassMidground> gmgObjects;
    private ArrayList<GrassOnground> gogObjects;
    private ArrayList<Cloud> cloudObjects;
    private RV brbad_rv;

    private Audio audiobg;

    /**
     * Constructor initializes the SceneFrame, its attributes, and gets certain objects from sceneCanvas for animating
     * it also plays the background audio from the start
     */
    public SceneFrame() {

        frame = new JFrame();
        sceneCanvas = new SceneCanvas(800, 600);
        gfgObjects = sceneCanvas.getFG();
        gbgObjects = sceneCanvas.getGBG();
        gmgObjects = sceneCanvas.getGMG();
        gogObjects = sceneCanvas.getGOG();
        cloudObjects = sceneCanvas.getClouds();
        brbad_rv = sceneCanvas.getRv();

        audiobg = new Audio();

        audiobg.setFile("BreakingBadTheme.wav");
        audiobg.play();
        audiobg.loop();
    }

    /**
     * Sets up the GUI for the animation
     */
    public void setUpGUI() {

        Container contentPane = frame.getContentPane();
        sceneCanvas.setPreferredSize(new Dimension(800, 600));

        contentPane.add(sceneCanvas, BorderLayout.CENTER);

        frame.setTitle("Midterm Project - Aquino - Castillo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

        
    }
    /**
     * Sets up the KeyListener as an anonymous class
     * This class is for listening for input to move the RV
     */
    public void setUpKeyListen() {

        KeyListener keyListen = new KeyListener() {

            
            @Override
            public void keyTyped(KeyEvent ke) {

            }

            @Override
            public void keyPressed(KeyEvent ke) {

                

                switch (ke.getKeyChar()) {
                    case 'a':

                        brbad_rv.moveLeft();

                        break;

                    case 'd':
                    
                        brbad_rv.moveRight();

                        break;

                    default:
                        break;
                }
                sceneCanvas.repaint();

            }

            @Override
            public void keyReleased(KeyEvent ke) {
                if (ke.getKeyChar() == 'a' || ke.getKeyChar() == 'd') {
                    brbad_rv.isSlowingDown();
                }
                sceneCanvas.repaint();
            }

        };

        frame.addKeyListener(keyListen);

    }

    /**
     * Sets up keylistener for audio
     * allows for listening to input for playing sound effects
     * 
     * Guided by these references:
     * - https://stackoverflow.com/questions/10876491/how-to-use-keylistener?fbclid=IwAR0i6TTuABwgG7j8D5rbQpL54_oFG84MC0J8hDYtk9Fkfeh081qEUsO4onk 
     * - https://www.geeksforgeeks.org/java-keylistener-in-awt/?fbclid=IwAR2r28nW5UYK73bzSbGMTMMDYk-IRMUCqhn0ON3ZWZZtikrjr7RBMR2AqmE 
     * - https://www.youtube.com/watch?v=BJ7fr9XwS2o
     */
    public void setUpKeyListenforAudio() {

        KeyListener keyListen2 = new KeyListener() {

            Audio audio1 = new Audio();
            Audio audio2 = new Audio();
            Audio audio3 = new Audio();
            Audio audio4 = new Audio();
            Audio audio5 = new Audio();
            Audio audio6 = new Audio();
            Audio audio7 = new Audio();

            String audio1Title = "This is my own private domicile and I will not be harassed.wav";
            String audio2Title = "I am the one who knocks.wav";
            String audio3Title = "Heisenberg.wav";
            String audio4Title = "hi my name is walter hartwell white.wav";
            String audio5Title = "you either run from things or you face them.wav";
            String audio6Title = "Yeah, Science!.wav";
            String audio7Title = "AsianMisterWhite.wav";

            @Override
            public void keyTyped(KeyEvent ke) {

                

            }

            @Override
            public void keyPressed(KeyEvent ke) {

                switch (ke.getKeyChar()) {
                    case 'q':

                        audio1.setFile(audio1Title);
                        audio1.play();

                        break;

                    case 'w':
                    
                        audio2.setFile(audio2Title);
                        audio2.play();

                        break;
                    
                    case 'e':

                        audio3.setFile(audio3Title);
                        audio3.play();

                        break;

                    case 'r':
                    
                        audio4.setFile(audio4Title);
                        audio4.play();

                        break;

                    case 't':
                    
                        audio5.setFile(audio5Title);
                        audio5.play();

                        break;

                    case 'y':
                    
                        audio6.setFile(audio6Title);
                        audio6.play();

                        break;

                    case 'u':
                    
                        audio7.setFile(audio7Title);
                        audio7.play();

                        break;
                    

                    default:
                        break;
                }
                
                

            }

            @Override
            public void keyReleased(KeyEvent ke) {

                switch (ke.getKeyChar()) {
                    case '1':

                        try {

                            audio1.stop();

                        } catch (IOException e) {

                            e.printStackTrace();

                        }

                        break;

                    case '2':
                    
                        try {

                            audio2.stop();

                        } catch (IOException e) {

                            e.printStackTrace();

                        }

                        break;
                    
                    case '3':

                        try {

                            audio3.stop();

                        } catch (IOException e) {

                            e.printStackTrace();

                        }

                        break;

                    case '4':
                    
                        try {

                            audio4.stop();

                        } catch (IOException e) {

                            e.printStackTrace();

                        }

                        break;

                    case '5':
                    
                        try {

                            audio5.stop();

                        } catch (IOException e) {

                            e.printStackTrace();

                        }

                        break;

                    case '6':
                    
                        try {

                            audio6.stop();

                        } catch (IOException e) {

                            e.printStackTrace();

                        }
                        break;

                    case '7':
                    
                        try {

                            audio7.stop();

                        } catch (IOException e) {

                            e.printStackTrace();

                        }

                        break;
                    

                    default:
                        break;
                
                }
            }

        };

        frame.addKeyListener(keyListen2);

    }

    /**
     * Sets up time listener as an inner class which implements ActionListener
     * 
     * Guided by:
     * - https://www.youtube.com/watch?v=tHNWIWxRDDA 
     */
    public void setUpTimeListen() {
        class TimeListener implements ActionListener {

            @Override
            public void actionPerformed( ActionEvent ae ) {
                // We repaint each frame
                sceneCanvas.repaint();

                // We call for loops for each object in the ArrayLists and call the necessary methods
                for ( GrassForeground obj: gfgObjects ) {
                    // We move right each frame,
                    obj.moveRight();
                    // Once the x value of the object has risen over 1200 (which is beyond the screen)
                    if (obj.getXValue() > 1200) {
                        // We then spawn it somewhere to the left, so it can move again
                        obj.resetPosition();
                    }
                }
                for (GrassBackground obj: gbgObjects) {
                    obj.moveRight();
                    if (obj.getXValue() > 1200) {
                        obj.resetPosition();
                    }
                }
                for (GrassMidground obj: gmgObjects) {
                    obj.moveRight();
                    if (obj.getXValue() > 1200) {
                        obj.resetPosition();
                    }
                }
                for (GrassOnground obj: gogObjects) {
                    obj.moveRight();
                    if (obj.getXValue() > 1200) {
                        obj.resetPosition();
                    }
                }
                for (Cloud obj: cloudObjects) {
                    obj.moveRight();
                    if (obj.getXValue() > 1200) {
                        obj.resetPosition();
                    }
                }
                // allows for easing in the slow down of the RV
                brbad_rv.slowDown();
            }
        };

        ActionListener timeListener = new TimeListener();
        Timer timer = new Timer(10, timeListener);
        timer.start();
    }

    
}
