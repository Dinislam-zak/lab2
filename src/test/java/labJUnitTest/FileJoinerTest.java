package labJUnitTest;

import org.junit.Assert;
import org.junit.Test;

import java.io.*;

public class FileJoinerTest {
    @Test
    public void testJoin(){
        File file1 = new File("file1.txt");
        File file2 = new File("file2.txt");
        File fileResult = new File("fileResult");
        FileJoiner.mergeFiles(file1,file2,fileResult);
        String result;
        try (BufferedReader reader = new BufferedReader(new FileReader(fileResult))){
            result = reader.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Assert.assertEquals("1 2 3 4 5arcwarden doom enchantress  ", result);
    }
}
