package labJUnitTest;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;


public class BracketsCheckTest {
    @Test
    public void TestBrackets() throws IOException {
        boolean result = BracketsCheck.validateJSON("transport.json");
        Assert.assertTrue(result);
    }
}
