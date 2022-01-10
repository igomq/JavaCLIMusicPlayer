package io.github.igomq.jcmp.Utility;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.*;
import java.io.File;

import static io.github.igomq.jcmp.Utility.GetCurrentDirectory.getCurrentDirectory;
import static io.github.igomq.jcmp.Utility.MP3toWAV.mp3toWav;
import static io.github.igomq.jcmp.Utility.MusicData.*;

public class PlayMusic {
    public static void playMusicOneFile(String musicLocation) {
        System.out.println("Running");
        try {
            File path = new File(musicLocation);
            String loc = path.toPath().toAbsolutePath().toString();
            System.out.println("File Path: "+ path.toPath().toAbsolutePath());

            if (loc.endsWith(".mp3")) {
                // TODO Add MP3 Support
                System.out.println("Only WAV Supported!");
                return;
//                System.out.println("mp3 file detected. Changing to wav");
//                mp3toWav(path, loc.replace(getCurrentDirectory(), ""));
//D
//                path = new File(loc.replace(".mp3", "_converted.wav"));
            }


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
