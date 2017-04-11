import java.util.Objects;

/**
 * Created by mdb on 11/04/17.
 */
public final class AccurateSorting {
    private final int[] elements;

    public AccurateSorting(int[] elements) {
        this.elements = Objects.requireNonNull(elements);
    }

    public boolean isSorted() {
        if (elements.length == 0 || elements.length == 1)
            return true;

        for (int i = 0; i < elements.length - 1; i++) {
            int e1 = elements[i];
            int e2 = elements[i + 1];
            if (e1 == e2)
                continue;
            if (e1 < e2)
                continue;
            if (e1 > e2 + 1)
                return false;

            // swap e1 and e2
            elements[i] = e2;
            elements[i+1] = e1;
        }
        return true;
    }
}
