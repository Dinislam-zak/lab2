package labJUnitTest;

import org.junit.Assert;
import org.junit.Test;
import java.io.IOException;


public class BracketsCheckTest {
    @Test
    public void TestBrackets() throws IOException {
        Assert.assertTrue(BracketsCheck.validateJSON("transport.json"));
    }
    @Test
    public void TestBrackets2() throws IOException {
        Assert.assertTrue(BracketsCheck.validateJSON("transport2.json"));
    }
    @Test
    public void testNonexistentFile() throws IOException {
        String filename = "afewf.json";
        Assert.assertTrue(BracketsCheck.validateJSON(filename));
    }

    @Test
    public void testEmptyFileName() throws IOException {
        String filename = "";
        Assert.assertTrue(BracketsCheck.validateJSON(filename));
    }

    @Test
    public void testNonJSONFile() throws IOException {
        String filename = "file1.txt";
        Assert.assertTrue(BracketsCheck.validateJSON(filename));
    }

}
