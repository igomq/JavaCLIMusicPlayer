package io.github.igomq.jcmp.Utility;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.*;
import java.io.File;

import static io.github.igomq.jcmp.Utility.MusicData.*;

public class PlayMusic {
    public static void playMusicOneFile(String musicLocation) {
        System.out.println("Running");
        try {
            File path = new File(musicLocation);

            if (path.exists()) {
                AudioInputStream ais = AudioSystem.getAudioInputStream(path);
                clip = AudioSystem.getClip();
                clip.open(ais);
                clip.start();
                clip.loop(Clip.LOOP_CONTINUOUSLY);

                // Temporary
                JOptionPane.showMessageDialog(null,"Presss OK to pause");
                cTs = clip.getMicrosecondPosition();
                clip.stop();

                JOptionPane.showMessageDialog(null, "Press OK to resume");
                clip.setMicrosecondPosition(cTs);
                clip.start();

                JOptionPane.showMessageDialog(null, "Press OK to stop");
            } else {
                System.out.println("File not exists!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
