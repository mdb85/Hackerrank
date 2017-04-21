import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by mdb on 21/04/17.
 */
public final class ReallySpecialSubtreeTest {

    @Test
    public void test_1() {
        ReallySpecialSubtree subTree = new ReallySpecialSubtree(4, 6);
        subTree.addEdge(1, 2, 5);
        subTree.addEdge(1, 3, 3);
        subTree.addEdge(4, 1, 6);
        subTree.addEdge(2, 4, 7);
        subTree.addEdge(3, 2, 4);
        subTree.addEdge(3, 4, 5);

        int weight = subTree.mstWeight();

        assertEquals(12, weight);
    }
}