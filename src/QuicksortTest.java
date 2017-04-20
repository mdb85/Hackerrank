import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by mdb on 20/04/17.
 */
public final class QuicksortTest {

    @Test
    public void test_1() {
        Quicksort qs = new Quicksort(new int[]{5, 8, 1, 3, 7, 9, 2});
        String result = qs.sort();
        String expected = new StringBuilder().append("2 3 ")
                .append("\n")
                .append("1 2 3 ")
                .append("\n")
                .append("7 8 9 ")
                .append("\n")
                .append("1 2 3 5 7 8 9 ")
                .append("\n")
                .toString();
        assertEquals(expected, result);
    }
}