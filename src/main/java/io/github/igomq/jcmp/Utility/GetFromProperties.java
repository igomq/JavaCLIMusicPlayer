package io.github.igomq.jcmp.Utility;

import io.github.igomq.jcmp.MusicPlayer;

import java.io.IOException;
import java.util.Properties;

public class GetFromProperties {
    private static final Properties properties = new Properties();
    public static Object getItem(String property) throws IOException {
        MusicPlayer mpClass = new MusicPlayer();
        properties.load(mpClass.getClass().getClassLoader().getResourceAsStream("project.properties"));

        return properties.getProperty(property);
    }
}
