package io.github.igomq.jcmp.Utility;

import java.nio.file.Path;
import java.nio.file.Paths;

public class GetCurrentDirectory {
    public static String getCurrentDirectory() {
        Path path = Paths.get("");

        return path.toAbsolutePath().toString();
    }
}
