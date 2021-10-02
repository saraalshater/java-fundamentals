/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linter;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.File;
import java.io.IOException;

import java.nio.file.Path;
import java.nio.file.Paths;

class LibraryTest {
    @Test void someLibraryMethodReturnsTrue() {
        Library classUnderTest = new Library();
        assertTrue(classUnderTest.someLibraryMethod(), "someLibraryMethod should return 'true'");
    }
    private static Path filePath(String file) throws IOException {
        String ttt = File.separator;
        String basePath = new File("").getCanonicalPath();
        Path p1;
        if (ttt.equals("\\")){
            p1 = Paths.get(basePath+"/src/test/resources/" + file);
        }else{
            p1 = Paths.get(basePath+"/src/test/resources/gates.js" + file);
        }
        System.out.println(p1);
        return p1;
    }
    @Test
//    @DisplayName("missingSemicolon should return 0 errors")
    public void hasSemicolonNoErrors() throws IOException {
        Path p1 = filePath("noErrors.js");

        int errorNum = Library.missingSemicolon(p1).get("ErrorCount");
        int LineCount = Library.missingSemicolon(p1).get("LineCount");
        assertEquals(14,(LineCount - errorNum));
    }

    @Test
//    @DisplayName("missingSemicolon should return 1 error")
    public void hasSemicolonOneErrors() throws IOException {
        Path p1 = filePath("oneError.js");
        int errorNum = Library.missingSemicolon(p1).get("ErrorCount");
        int LineCount = Library.missingSemicolon(p1).get("LineCount");
        assertEquals(13,(LineCount - errorNum));
    }

    @Test
//    @DisplayName("missingSemicolon should return 4 errors")
    public void hasSemicolonFewErrors() throws IOException {
        Path p1 = filePath("fewErrors.js");
        int errorNum = Library.missingSemicolon(p1).get("ErrorCount");
        int LineCount = Library.missingSemicolon(p1).get("LineCount");
        assertEquals(10,(LineCount - errorNum));
    }

    @Test
//    @DisplayName("missingSemicolon should return 4 errors")
    public void hasSemicolonManyErrors() throws IOException {
        Path p1 = filePath("manyErrors.js");
        int errorNum = Library.missingSemicolon(p1).get("ErrorCount");
        int LineCount = Library.missingSemicolon(p1).get("LineCount");
        assertEquals(100,(LineCount - errorNum));
    }
    @Test
//    @DisplayName("missingSemicolon should return 4 errors")
    public void emptyFile() throws IOException {
        Path p1 = filePath("empty.js");

        int LineCount = Library.missingSemicolon(p1).get("LineCount");
        int errorNum = Library.missingSemicolon(p1).get("ErrorCount");
        assertEquals(0,LineCount);
        assertEquals(0,errorNum);
    }
}