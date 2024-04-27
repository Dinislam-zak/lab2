package labJUnitTest;
import org.junit.Assert;
import org.junit.Test;
public class MathUtilTest {
    @Test
    public void testExp(){
        double r = MathUtil.exp(0.0);
        double epsilon = 0.000001;
        Assert.assertEquals(1, r,epsilon);
        Assert.assertEquals(Math.exp(1d),MathUtil.exp(1d),epsilon);
    }
}
