package io.github.igomq.jcmp.Utility;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

import static io.github.igomq.jcmp.Utility.GetCurrentDirectory.getCurrentDirectory;

public class MP3toWAV {
    public static void mp3toWav(File mp3Data, String originalFileName)  {
        // TODO Make mp3 to wav converter by Jan 15, 2022

//            AudioFileFormat inputFileFormat = AudioSystem.getAudioFileFormat(mp3Data);
//            AudioInputStream ais = AudioSystem.getAudioInputStream(mp3Data);
//
//            AudioFormat audioFormat = ais.getFormat();
//
//            System.out.println("File Format Type: "+inputFileFormat.getType());
//            System.out.println("File Format String: "+inputFileFormat.toString());
//            System.out.println("File lenght: "+inputFileFormat.getByteLength());
//            System.out.println("Frame length: "+inputFileFormat.getFrameLength());
//            System.out.println("Channels: "+audioFormat.getChannels());
//            System.out.println("Encoding: "+audioFormat.getEncoding());
//            System.out.println("Frame Rate: "+audioFormat.getFrameRate());
//            System.out.println("Frame Size: "+audioFormat.getFrameSize());
//            System.out.println("Sample Rate: "+audioFormat.getSampleRate());
//            System.out.println("Sample size (bits): "+audioFormat.getSampleSizeInBits());
//            System.out.println("Big endian: "+audioFormat.isBigEndian());
//            System.out.println("Audio Format String: "+audioFormat.toString());
//
//            AudioInputStream encodedASI = AudioSystem.getAudioInputStream(AudioFormat.Encoding.PCM_SIGNED, ais);
//
//            try{
//                int i = AudioSystem.write(encodedASI, AudioFileFormat.Type.WAVE, new File(getCurrentDirectory() + "\\" + originalFileName + "_converted.wav"));
//                System.out.println("Bytes Written: "+i);
//            }catch(Exception e){
//                e.printStackTrace();
//            }
//        }catch(Exception e){
//            e.printStackTrace();
//        }
    }
}
