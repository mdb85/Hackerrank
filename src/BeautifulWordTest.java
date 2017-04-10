import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by mdb on 11/04/17.
 */
public final class BeautifulWordTest {

    @Test(expected = NullPointerException.class)
    public void test_1() {
        BeautifulWord beautifulWord = newBeautifulWord(null);

        // Exception expected
    }

    @Test
    public void test_2() {
        BeautifulWord beautifulWord = newBeautifulWord("batman");
        boolean result = beautifulWord.isBeautiful();
        assertTrue(result);
    }

    @Test
    public void test_3() {
        BeautifulWord beautifulWord = newBeautifulWord("apple");
        boolean result = beautifulWord.isBeautiful();
        assertFalse(result);
    }

    @Test
    public void test_4() {
        BeautifulWord beautifulWord = newBeautifulWord("beauty");
        boolean result = beautifulWord.isBeautiful();
        assertFalse(result);
    }

    @Test
    public void test_5() {
        BeautifulWord beautifulWord = newBeautifulWord("");
        boolean result = beautifulWord.isBeautiful();
        assertTrue(result);
    }

    @Test
    public void test_6() {
        BeautifulWord beautifulWord = newBeautifulWord("b");
        boolean result = beautifulWord.isBeautiful();
        assertTrue(result);
    }

    @Test
    public void test_7() {
        BeautifulWord beautifulWord = newBeautifulWord("e");
        boolean result = beautifulWord.isBeautiful();
        assertTrue(result);
    }

    @Test
    public void test_8() {
        BeautifulWord beautifulWord = newBeautifulWord("abacaba");
        boolean result = beautifulWord.isBeautiful();
        assertTrue(result);
    }

    @Test
    public void test_9() {
        BeautifulWord beautifulWord = newBeautifulWord("badd");
        boolean result = beautifulWord.isBeautiful();
        assertFalse(result);
    }

    @Test
    public void test_10() {
        BeautifulWord beautifulWord = newBeautifulWord("yes");
        boolean result = beautifulWord.isBeautiful();
        assertFalse(result);
    }

    private static BeautifulWord newBeautifulWord(String word) {
        return new BeautifulWord(word);
    }
}