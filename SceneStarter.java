import javax.swing.*;

public class SceneStarter {

    public static void main(String[] args) {
        
        SceneFrame sf = new SceneFrame();
        sf.setUpGUI();
        sf.setUpKeyListen();
        sf.setUpTimeListen();

    }
    
}
