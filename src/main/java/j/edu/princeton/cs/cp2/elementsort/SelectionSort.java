package j.edu.princeton.cs.cp2.elementsort;

import j.edu.princeton.cs.cp2.AbstractSort;

/**
 * j.edu.princeton.cs.cp2.elementsort
 * Created by hefuduo on 5/21/21.
 */
public class SelectionSort extends AbstractSort {

    public SelectionSort(Comparable[] a) {
        array = a;
    }

    @Override
    public void sort() {
        int N = array.length;
        for (int i = 0; i < N; i++) {
            int min = i;
            for (int j = i + 1; j < N; j++) {
                if (less(array[j], array[min])) {
                    min = j;
                }
            }
            exch(i, min);
        }
    }
}
