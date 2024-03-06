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

    public void setUpGUI() {

        Container contentPane = frame.getContentPane();
        sceneCanvas.setPreferredSize(new Dimension(800, 600));

        contentPane.add(sceneCanvas, BorderLayout.CENTER);

        frame.setTitle("Midterm Project - Aquino - Castillo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

        
    }

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
            String audio7Title = "Asian gibberish.wav";

            @Override
            public void keyTyped(KeyEvent ke) {

                

            }

            @Override
            public void keyPressed(KeyEvent ke) {

                switch (ke.getKeyChar()) {
                    case 'm':

                        audio1.setFile(audio1Title);
                        audio1.play();

                        break;

                    case 'j':
                    
                        audio2.setFile(audio2Title);
                        audio2.play();

                        break;
                    
                    case 'k':

                        audio3.setFile(audio3Title);
                        audio3.play();

                        break;

                    case 'l':
                    
                        audio4.setFile(audio4Title);
                        audio4.play();

                        break;

                    case 'i':
                    
                        audio5.setFile(audio5Title);
                        audio5.play();

                        break;

                    case 'o':
                    
                        audio6.setFile(audio6Title);
                        audio6.play();

                        break;

                    case 'p':
                    
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

    public void setUpTimeListen() {
        class TimeListener implements ActionListener {

            @Override
            public void actionPerformed( ActionEvent ae ) {
                sceneCanvas.repaint();
                for ( GrassForeground obj: gfgObjects ) {
                    obj.moveRight();
                    if (obj.getXValue() > 1200) {
                        obj.resetPosition();
                    }
                }
                for (GrassBackground obj: gbgObjects) {
                    obj.moveRight();
                    if (obj.getXValue() > 800) {
                        obj.resetPosition();
                    }
                }
                for (GrassMidground obj: gmgObjects) {
                    obj.moveRight();
                    if (obj.getXValue() > 800) {
                        obj.resetPosition();
                    }
                }
                for (GrassOnground obj: gogObjects) {
                    obj.moveRight();
                    if (obj.getXValue() > 800) {
                        obj.resetPosition();
                    }
                }
                for (Cloud obj: cloudObjects) {
                    obj.moveRight();
                    if (obj.getXValue() > 800) {
                        obj.resetPosition();
                    }
                }
                brbad_rv.slowDown();
            }
        };

        ActionListener timeListener = new TimeListener();
        Timer timer = new Timer(1, timeListener);
        timer.start();
    }

    
}
