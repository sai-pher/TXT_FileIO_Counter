import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class FileCounterTest {

    FileCounter p;
    private String filePath = "src/data/test_file.txt";

    @BeforeEach
    void setUp() {
        p = new FileCounter(filePath);
    }

    @Test
    void testFileIsReadable() {
        Path pt = p.getPATH();
        assertTrue(pt.toFile().exists(), "File is supposed to exsist (true)");
    }

    @Test
    void countWordsInFile() {
        assertEquals(33, p.countWordsInFile(), "words should be greater than 0");
    }

    @Test
    void countWordsGt5() {
        assertEquals(4, p.countWordsGt5(), "There should be words greater than 5");
    }
}