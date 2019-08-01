package FileCounterPackage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileCounter {

    private final Path PATH;


    // Load from text file
    public FileCounter(String filePath) {
        this.PATH = Paths.get(filePath);
    }

    public static void main(String[] args) {


    }

    public Path getPATH() {
        return PATH;
    }

    // count words longer than 5 chars

    // Count words in text file
    public int countWordsInFile() {

        int res = 0;
        try {
            for (String s : Files.readAllLines(PATH)) {
                String[] words = s.split(" ");
                res += words.length;
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        return res;
    }

    // *BONUS* -> Build histogram of words of that length

    public int countWordsGt5() {
        int res = 0;

        try {
            for (String s : Files.readAllLines(PATH)) {
                String[] words = s.split(" ");
                long     count = 0L;
                for (String sr : words) {
                    if (sr.length() > 5) {
                        count++;
                    }
                }
                res += count;
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }


        return res;
    }
}
