package labJUnitTest;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;


public class BracketsCheckTest {
    @Test
    public void TestBrackets() throws IOException {
        Assert.assertTrue(BracketsCheck.validateJSON("transport.json"));
        Assert.assertTrue(BracketsCheck.validateJSON("transport2.json"));
    }
}
