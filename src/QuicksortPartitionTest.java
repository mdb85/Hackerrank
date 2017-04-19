import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by mdb on 20/04/17.
 */
public final class QuicksortPartitionTest {

    @Test
    public void test_1() {
        QuicksortPartition qs = new QuicksortPartition(new int[]{2});

        int[] result = qs.partition();

        assertArrayEquals(new int[]{2}, result);
    }

    @Test
    public void test_2() {
        QuicksortPartition qs = new QuicksortPartition(new int[]{4, 5, 3, 7, 2});

        int[] result = qs.partition();

        assertArrayEquals(new int[]{3, 2, 4, 5, 7}, result);
    }
}