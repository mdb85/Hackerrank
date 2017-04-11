import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by mdb on 11/04/17.
 */
public final class AccurateSortingTest {

    @Test(expected = NullPointerException.class)
    public void test_1() {
        AccurateSorting accurateSorting = newAccurateSorting(null);

        // Exception is expected
    }

    @Test
    public void test_2() {
        AccurateSorting accurateSorting = newAccurateSorting(new int[]{});
        boolean result = accurateSorting.isSorted();
        assertTrue(result);
    }

    @Test
    public void test_3() {
        AccurateSorting accurateSorting = newAccurateSorting(new int[]{3});
        boolean result = accurateSorting.isSorted();
        assertTrue(result);
    }

    @Test
    public void test_4() {
        AccurateSorting accurateSorting = newAccurateSorting(new int[]{3, 2});
        boolean result = accurateSorting.isSorted();
        assertTrue(result);
    }

    @Test
    public void test_5() {
        AccurateSorting accurateSorting = newAccurateSorting(new int[]{3, 5});
        boolean result = accurateSorting.isSorted();
        assertTrue(result);
    }

    @Test
    public void test_6() {
        AccurateSorting accurateSorting = newAccurateSorting(new int[]{5, 3});
        boolean result = accurateSorting.isSorted();
        assertFalse(result);
    }

    @Test
    public void test_7() {
        AccurateSorting accurateSorting = newAccurateSorting(new int[]{1, 0, 3, 2});
        boolean result = accurateSorting.isSorted();
        assertTrue(result);
    }

    @Test
    public void test_8() {
        AccurateSorting accurateSorting = newAccurateSorting(new int[]{2, 1, 0});
        boolean result = accurateSorting.isSorted();
        assertFalse(result);
    }

    private AccurateSorting newAccurateSorting(int[] array) {
        return new AccurateSorting(array);
    }
}