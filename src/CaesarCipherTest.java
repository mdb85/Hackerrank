import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by mdb on 20/04/17.
 */
public final class CaesarCipherTest {

    @Test
    public void test_0() {
        CaesarCipher cipher = new CaesarCipher(2, "middle-Outz");

        String result = cipher.cipher();

        assertEquals("okffng-Qwvb", result);
    }

    @Test
    public void test_1() {
        CaesarCipher cipher = new CaesarCipher(2, "z");

        String result = cipher.cipher();

        assertEquals("b", result);
    }

    @Test
    public void test_2() {
        CaesarCipher cipher = new CaesarCipher(2, "Z");

        String result = cipher.cipher();

        assertEquals("B", result);
    }

    @Test
    public void test_3() {
        CaesarCipher cipher = new CaesarCipher(26, "Z");

        String result = cipher.cipher();

        assertEquals("Z", result);
    }

    @Test
    public void test_4() {
        CaesarCipher cipher = new CaesarCipher(27, "Z");

        String result = cipher.cipher();

        assertEquals("A", result);
    }
}