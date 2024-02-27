import javax.swing.*;

public class CanvasTester {

    public static void main(String[] args) {
        
        int w = 800;
        int h = 600;
        JFrame testFrame = new JFrame();
        DrawingCanvas cnvs = new DrawingCanvas(w, h);
        
        testFrame.setSize(w, h);
        testFrame.setTitle("RV TEST");
        testFrame.add(cnvs);
        testFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        testFrame.setVisible(true);
        

    }
    
}
