package io.github.igomq.jcmp;

import java.io.IOException;

import static io.github.igomq.jcmp.Utility.GetCurrentDirectory.getCurrentDirectory;
import static io.github.igomq.jcmp.Utility.GetProperties.getItem;
import static io.github.igomq.jcmp.Utility.ASCIIArt.*;
import static io.github.igomq.jcmp.Utility.PlayMusic.*;

public class MusicPlayer {
     public static void main(String[] args) throws IOException {
          System.out.println(shortSoftText +
                  "Java CLI Music Player" +
                  "\nMade by 💠 Jaeyoon0609 & GomQ" +
                  "\nRepository : https://github.com/igomq/JavaCLIMusicPlayer" +
                  "\n\nVersion " + getItem("version"));

          playMusicOneFile(getCurrentDirectory() + "\\TestMusic.wav");
     }
}