package labJUnitTest;

import org.junit.Assert;
import org.junit.Test;

public class InsertionSortTest {
    @Test
    public void sortTest(){
        int [] array1sorted = {1, 2, 3, 4, 5};
        int [] array1 = {2, 5, 4, 3, 1};
        int [] array2sorted = {1, 160, 167, 186, 200, 500, 515};
        int [] array2 = {500, 1, 160, 515, 167, 186, 200};
        Assert.assertArrayEquals(array1sorted, InsertionSort.sort(array1));
        Assert.assertArrayEquals(array2sorted, InsertionSort.sort(array2));
    }
}
