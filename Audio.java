import java.io.File;
import java.io.IOException;
import javax.sound.sampled.*;

public class Audio {

    Clip clip;
    AudioInputStream sound;

    // when calling this, sound file name should be specific and in .wav
    public void setFile(String soundFileName) {
        try {
            File file = new File(soundFileName);
            sound = AudioSystem.getAudioInputStream(file);
            clip = AudioSystem.getClip();
            clip.open(sound);
        } catch (Exception e) {

        }
    }

    public void play() {
        clip.start();
    }

    public void loop() {
        clip.loop(clip.LOOP_CONTINUOUSLY);
    }

    public void stop() throws IOException {
        sound.close();
        clip.close();
        clip.stop();
    }
    
}
