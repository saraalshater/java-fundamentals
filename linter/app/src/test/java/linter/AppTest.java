/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linter;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class AppTest {
    public static void main(String[] args) throws IOException {
        System.out.println("TESTING");
        App demo = new App();
        Path path;
        path = Paths.get("\\\\wsl$\\Ubuntu\\home\\saraalshater\\401\\java-fundamentals\\linter\\app\\src\\main\\resources\\gates.js");
        demo.linter(path);
    }
}
