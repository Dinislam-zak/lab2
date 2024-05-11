package labJUnitTest;

import org.junit.Assert;
import org.junit.Test;

import java.io.*;

public class FileJoinerBinaryTest {
    @Test
    public void joinBinaryTest() {
        File file1 = new File("file1.bin");
        File file2 = new File("file2.bin");
        File fileResult = new File("fileResult.bin");
        File fileResult2 = new File("fileResult2.bin");
        FileJoiner.mergeFiles(file1, file2, fileResult);
        String result1;
        String result2;
        try (BufferedReader reader = new BufferedReader(new FileReader(fileResult))){
            result1 = reader.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try (BufferedReader reader = new BufferedReader(new FileReader(fileResult2))){
            result2 = reader.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Assert.assertEquals(result1, result2);
    }
}
