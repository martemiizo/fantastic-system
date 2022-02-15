import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestTest {

    @Test
    public void IndexStorageTest() {
        final int SIZE_STORAGE = 10;

        int[] arrResult;

        IndexStorage ais1 = new IndexStorage(SIZE_STORAGE);
        arrResult = new int[ais1.size()];

        for (int i = 0; i < arrResult.length; i++) {
            arrResult[i] = ais1.get(i);
        }

        int[] expect = {-9, 8, -7, 6, -5, 4, -3, 2, -1, 0};
        int[] actual = ais1.reverse();

        Assertions.assertArrayEquals(expect, actual);
    }

    @Test
    public void ArrayIndexStorageTest() {
        final int SIZE = 10;
        int[] arrx = new int[SIZE];

        for (int i = 0; i < arrx.length; i++) {
            arrx[i] = i;
        }
        ArrayIndexStorage ais = new ArrayIndexStorage(arrx);

        int[] expect = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        int[] actual = ais.reverse();

        Assertions.assertArrayEquals(expect, actual);
    }
}


