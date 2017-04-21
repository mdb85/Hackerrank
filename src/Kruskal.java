import java.util.Arrays;

/**
 * Created by mdb on 21/04/17.
 */
public final class Kruskal {

    private final int V;
    private final int E;
    private final Graph graph;

    public Kruskal(int v, int e) {
        V = v;
        E = e;
        this.graph = new Graph(v, e);
    }

    private static final class Graph {
        private final int v;
        private final int e;
        private final Edge edge[]; // collection of all edges
        private int edgeIndex;

        // Creates a graph with v vertices and e edges
        Graph(int v, int e) {
            this.v = v;
            this.e = e;
            edge = new Edge[this.e];
        }

        void addEdge(int src, int dest, int weight) {
            edge[edgeIndex++] = new Edge(src, dest, weight);
        }

        // A utility function to find set of an element i
        // (uses path compression technique)
        int find(subset subsets[], int i) {
            // find root and make root as parent of i (path compression)
            if (subsets[i].parent != i)
                subsets[i].parent = find(subsets, subsets[i].parent);

            return subsets[i].parent;
        }

        // A function that does union of two sets of x and y
        // (uses union by rank)
        void union(subset subsets[], int x, int y) {
            int xroot = find(subsets, x);
            int yroot = find(subsets, y);

            // Attach smaller rank tree under root of high rank tree
            // (union by Rank)
            if (subsets[xroot].rank < subsets[yroot].rank)
                subsets[xroot].parent = yroot;
            else if (subsets[xroot].rank > subsets[yroot].rank)
                subsets[yroot].parent = xroot;

                // If ranks are same, then make one as root and increment
                // its rank by one
            else {
                subsets[yroot].parent = xroot;
                subsets[xroot].rank++;
            }
        }
    }

    // A class to represent a graph edge
    private static final class Edge implements Comparable<Edge> {
        private final int src;
        private final int dest;
        private final int weight;

        public Edge(int src, int dest, int weight) {
            this.src = src;
            this.dest = dest;
            this.weight = weight;
        }

        // Comparator function used for sorting edges based on
        // their weight
        public int compareTo(Edge compareEdge) {
            return this.weight - compareEdge.weight;
        }
    }

    // A class to represent a subset for union-find
    private static final class subset {
        private int parent;
        private int rank;
    }

    void addEdge(int src, int dest, int weight) {
        graph.addEdge(src, dest, weight);
    }

    public void mst() {
        Edge result[] = new Edge[V];  // Tnis will store the resultant MST
        int e = 0;  // An index variable, used for result[]

        // Step 1:  Sort all the edges in non-decreasing order of their
        // weight.  If we are not allowed to change the given graph, we
        // can create a copy of array of edges
        Edge[] edge = graph.edge;
        Arrays.sort(edge);

        // Allocate memory for creating v ssubsets
        subset subsets[] = new subset[V];
        for (int i = 0; i < V; ++i)
            subsets[i] = new subset();

        // Create v subsets with single elements
        for (int v = 0; v < V; ++v) {
            subsets[v].parent = v;
            subsets[v].rank = 0;
        }

        int edgesCount = 0;  // Index used to pick next edge

        // Number of edges to be taken is equal to v-1
        while (e < V - 1) {
            // Step 2: Pick the smallest edge. And increment the index
            // for next iteration
            Edge next_edge = edge[edgesCount++];

            int x = graph.find(subsets, next_edge.src);
            int y = graph.find(subsets, next_edge.dest);

            // If including this edge does't cause cycle, include it
            // in result and increment the index of result for next edge
            if (x != y) {
                result[e++] = next_edge;
                graph.union(subsets, x, y);
            }
            // Else discard the next_edge
        }

        // print the contents of result[] to display the built MST
        System.out.println("Following are the edges in the constructed MST");
        for (int i = 0; i < e; ++i)
            System.out.println(result[i].src + " -- " + result[i].dest + " == " +
                    result[i].weight);
    }
}
