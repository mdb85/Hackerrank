import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by mdb on 20/04/17.
 */
public final class SuperReducedStringTest {

    @Test
    public void test_1() {
        SuperReducedString srs = new SuperReducedString("abdd");

        String result = srs.reduce();

        assertEquals("ab", result);
    }

    @Test
    public void test_2() {
        SuperReducedString srs = new SuperReducedString("aaabccddd");

        String result = srs.reduce();

        assertEquals("abd", result);
    }

    @Test
    public void test_3() {
        SuperReducedString srs = new SuperReducedString("aa");

        String result = srs.reduce();

        assertEquals("Empty String", result);
    }

    @Test
    public void test_4() {
        SuperReducedString srs = new SuperReducedString("baab");

        String result = srs.reduce();

        assertEquals("Empty String", result);
    }
}