import java.util.ArrayList;
import java.util.List;

import static java.util.Objects.requireNonNull;

/**
 * Created by mdb on 20/04/17.
 */
public final class QuicksortPartition {
    private final int[] array;

    public QuicksortPartition(int[] array) {
        this.array = requireNonNull(array);
    }

    public int[] partition() {
        if (array.length == 0)
            return new int[]{};

        int pivot = array[0];
        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();

        for (int i = 1; i < array.length; i++) {
            int element = array[i];
            if (pivot > element)
                left.add(element);
            else
                right.add(element);
        }

        int[] partitioned = new int[left.size() + right.size() + 1];
        int i = 0;
        for (Integer e : left)
            partitioned[i++] = e;

        partitioned[i++] = pivot;

        for (Integer e : right)
            partitioned[i++] = e;

        return partitioned;
    }
}
