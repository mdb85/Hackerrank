import java.math.BigInteger;

/**
 * Created by mdb on 11/04/17.
 */
public final class FibonacciModified {
    private final int t1;
    private final int t2;
    private final int n;

    public FibonacciModified(int t1, int t2, int n) {
        this.t1 = t1;
        this.t2 = t2;
        this.n = n;
    }

    public BigInteger compute() {

        BigInteger lastLast = BigInteger.valueOf(t1);
        BigInteger last = BigInteger.valueOf(t2);
        for (int i = 2; i < n; i++) {
            BigInteger next = last.pow(2).add(lastLast);
            lastLast = last;
            last = next;
        }
        return last;
    }
}
