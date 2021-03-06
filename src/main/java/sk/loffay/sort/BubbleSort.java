package sk.loffay.sort;

/**
 * @author Pavol Loffay
 *
 * Best =       N
 * Average =    N^2
 * Worst =      N^2
 * Space comp = 1
 * Is stable - alg. does NOT change position of elements with the same keys
 */
public class BubbleSort<T extends Comparable<T>> implements Sort<T> {

    @Override
    public void sort(T[] arr) {

        boolean change = true;
        int last = arr.length;
        while (change) {
            change = false;
            for (int i = 0; i < last - 1; i++) {
                if (arr[i].compareTo(arr[i+1]) > 0) {
                    T temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    change = true;
                }
            }

            last--;
        }
    }
}
