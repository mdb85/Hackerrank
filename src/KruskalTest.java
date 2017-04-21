import org.junit.Test;

/**
 * Created by mdb on 21/04/17.
 */
public final class KruskalTest {

    @Test
    public void test_0() {
        Kruskal kruskal = new Kruskal(4, 5);
        kruskal.addEdge(0, 1, 10);
        kruskal.addEdge(0, 2, 6);
        kruskal.addEdge(0, 3, 5);
        kruskal.addEdge(1, 3, 15);
        kruskal.addEdge(2, 3, 4);
        kruskal.mst();
    }
}
