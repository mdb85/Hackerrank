import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by mdb on 12/04/17.
 */
public final class AbbreviationTest {
    @Test
    public void test1() {
        Abbreviation abb = new Abbreviation("dabcd", "ABC");
        boolean result = abb.canBeAbbreviated();
        assertTrue(result);
    }

    @Test(expected = NullPointerException.class)
    public void test2() {
        new Abbreviation(null, "ABC");

        // Exception is expected
    }

    @Test(expected = NullPointerException.class)
    public void test3() {
        new Abbreviation("abc", null);

        // Exception is expected
    }

    @Test
    public void test4() {
        Abbreviation abb = new Abbreviation("abd", "ABCD");
        boolean result = abb.canBeAbbreviated();
        assertFalse(result);
    }

    @Test
    public void test6() {
        Abbreviation abb = new Abbreviation("daBcd", "ABC");
        boolean result = abb.canBeAbbreviated();
        assertTrue(result);
    }

    @Test
    public void test7() {
        Abbreviation abb = new Abbreviation("KXzQ", "K");
        boolean result = abb.canBeAbbreviated();
        assertFalse(result);
    }

    @Test
    public void test8() {
        Abbreviation abb = new Abbreviation("aABC", "ABC");
        boolean result = abb.canBeAbbreviated();
        assertTrue(result);
    }

    @Test
    public void test9() {
        Abbreviation abb = new Abbreviation("aAaBC", "ABC");
        boolean result = abb.canBeAbbreviated();
        assertFalse(result);
    }

    @Test
    public void test10() {
        Abbreviation abb = new Abbreviation("AABC", "ABC");
        boolean result = abb.canBeAbbreviated();
        assertFalse(result);
    }

    @Test
    public void test11() {
        Abbreviation abb = new Abbreviation("AA", "A");
        boolean result = abb.canBeAbbreviated();
        assertFalse(result);
    }

    @Test
    public void test12() {
        Abbreviation abb = new Abbreviation("abAxxaBa", "ABA");
        boolean result = abb.canBeAbbreviated();
        assertFalse(result);
    }

    @Test
    public void test13() {
        Abbreviation abb = new Abbreviation("daBCC", "ABC");
        boolean result = abb.canBeAbbreviated();
        assertFalse(result);
    }

    @Test
    public void test14() {
        Abbreviation abb = new Abbreviation("aAA", "A");
        boolean result = abb.canBeAbbreviated();
        assertFalse(result);
    }

    @Test
    public void test15() {
        Abbreviation abb = new Abbreviation("abbBB", "BB");
        boolean result = abb.canBeAbbreviated();
        assertTrue(result);
    }

    @Test
    public void test16() {
        Abbreviation abb = new Abbreviation("abCBc", "ABC");
        boolean result = abb.canBeAbbreviated();
        assertFalse(result);
    }

    @Test
    public void test17() {
        Abbreviation abb = new Abbreviation("aB", "B");
        boolean result = abb.canBeAbbreviated();
        assertTrue(result);
    }

    @Test
    public void test18() {
        Abbreviation abb = new Abbreviation("Kqiwysuaqm", "K");
        boolean result = abb.canBeAbbreviated();
        assertTrue(result);
    }

    @Test
    public void test19() {
        Abbreviation abb = new Abbreviation("ADdCADbcAddeAabebd", "ADECAADBCDAA");
        boolean result = abb.canBeAbbreviated();
        assertFalse(result);
    }

    @Test
    public void test20() {
        Abbreviation abb = new Abbreviation("aBadadcbA", "ABACB");
        boolean result = abb.canBeAbbreviated();
        assertFalse(result);
    }

    @Test
    public void test21() {
        Abbreviation abb = new Abbreviation("SRTING", "STRING");
        boolean result = abb.canBeAbbreviated();
        assertFalse(result);
    }

    @Test
    public void test22() {
        Abbreviation abb = new Abbreviation("Aba", "BA");
        boolean result = abb.canBeAbbreviated();
        assertFalse(result);
    }

    @Test
    public void test23() {
        Abbreviation abb = new Abbreviation("daBcCd", "ABCD");
        boolean result = abb.canBeAbbreviated();
        assertTrue(result);
    }
}