import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.Timer;

public class SceneFrame {

    private JFrame frame;
    private SceneCanvas scneCanvas;

    public SceneFrame() {

        frame = new JFrame();
        scneCanvas = new SceneCanvas(800, 600);

    }

    public void setUpGUI() {

        Container contentPane = frame.getContentPane();
        scneCanvas.setPreferredSize(new Dimension(800, 600));

        contentPane.add(scneCanvas, BorderLayout.CENTER);

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

                RV brbad_rv = scneCanvas.getRv();

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
                scneCanvas.repaint();

            }

            @Override
            public void keyReleased(KeyEvent ke) {

            }

        };

        frame.addKeyListener(keyListen);

    }

    public void setUpTimeListen() {
        class TimeListener implements ActionListener {

            @Override
            public void actionPerformed( ActionEvent ae ) {
                scneCanvas.getFG().moveRight();
                scneCanvas.repaint();
                scneCanvas.makeNewFG();
            }
        };

        ActionListener timeListener = new TimeListener();
        Timer timer = new Timer(1, timeListener);
        timer.start();
    }

    
}
