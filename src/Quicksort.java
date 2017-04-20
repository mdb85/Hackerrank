import java.util.ArrayList;
import java.util.List;

import static java.util.Objects.requireNonNull;

/**
 * Created by mdb on 20/04/17.
 */
public final class Quicksort {
    private final int[] array;

    public Quicksort(int[] array) {
        this.array = requireNonNull(array);
    }

    public String sort() {
        StringBuilder sb = new StringBuilder();
        int[] sorted = sort(array, sb);
        print(sorted, sb);
        return sb.toString();
    }

    private static int[] sort(int[] array, StringBuilder sb) {
        if (array.length == 0 || array.length == 1)
            return array;

        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();

        int pivot = partition(array, left, right);
        int[] sortedLeft = sort(toArray(left), sb);
        print(sortedLeft, sb);
        int[] sortedRight = sort(toArray(right), sb);
        print(sortedRight, sb);

        return merge(sortedLeft, pivot, sortedRight);
    }

    private static void print(int[] arr, StringBuilder sb) {
        if (arr.length == 0 || arr.length == 1)
            return;

        for (int e : arr) {
            sb.append(e).append(" ");
        }
        sb.append("\n");
    }

    private static int partition(int[] array, List<Integer> left, List<Integer> right) {
        int pivot = array[0];

        for (int i = 1; i < array.length; i++) {
            int element = array[i];
            if (pivot > element)
                left.add(element);
            else
                right.add(element);
        }

        return pivot;
    }

    private static int[] merge(int[] left, int pivot, int[] right) {
        int[] arr = new int[left.length + right.length + 1];
        int i = 0;
        for (int e : left)
            arr[i++] = e;

        arr[i++] = pivot;

        for (int e : right)
            arr[i++] = e;

        return arr;
    }

    private static int[] toArray(List<Integer> list) {
        int[] arr = new int[list.size()];
        int i = 0;
        for (int e : list)
            arr[i++] = e;

        return arr;
    }
}
