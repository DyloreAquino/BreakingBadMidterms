import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

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

    public void setupKeyListen() {

        KeyListener keyListen = new KeyListener() {

            @Override
            public void keyTyped(KeyEvent e) {

                RV brbad_rv = scneCanvas.getRv();

                switch (e.getKeyChar()) {
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
            public void keyPressed(KeyEvent e) {

            }

            @Override
            public void keyReleased(KeyEvent e) {

            }

        };

        frame.addKeyListener(keyListen);

    }

    
}
