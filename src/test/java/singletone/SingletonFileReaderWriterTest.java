package singletone;

import org.junit.Assert;
import org.junit.Test;

public class SingletonFileReaderWriterTest {
    @Test
    public void TestClass(){
        SingletonFileReaderWriter singleton1 = SingletonFileReaderWriter.getInstance();
        SingletonFileReaderWriter singleton2 = SingletonFileReaderWriter.getInstance();

        Assert.assertSame(singleton1, singleton2);
    }
}
