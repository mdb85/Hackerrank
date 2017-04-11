import org.junit.Test;

import java.math.BigInteger;

import static org.junit.Assert.*;

/**
 * Created by mdb on 11/04/17.
 */
public final class FibonacciModifiedTest {
    @Test
    public void test_1() {
        FibonacciModified fibonacciModified = new FibonacciModified(0, 1, 5);
        BigInteger result = fibonacciModified.compute();
        assertEquals(5, result.longValue());
    }

    @Test
    public void test_2() {
        FibonacciModified fibonacciModified = new FibonacciModified(0, 1, 6);
        BigInteger result = fibonacciModified.compute();
        assertEquals(27, result.longValue());
    }

    @Test
    public void test_3() {
        FibonacciModified fibonacciModified = new FibonacciModified(0, 1, 10);
        BigInteger result = fibonacciModified.compute();
        assertEquals("84266613096281243382112", result.toString());
    }
}