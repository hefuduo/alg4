package j.edu.princeton.cs.cp2;

import j.edu.princeton.cs.cp2.elementsort.SelectionSort;

import java.util.Arrays;

/**
 * j.edu.princeton.cs.cp2
 * Created by hefuduo on 5/21/21.
 */
public class Main {
    public static void main(String[] args) {
        Integer[] array = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Knuth.shuffle(array);
        System.out.println(Arrays.toString(array));
        SelectionSort s = new SelectionSort(array);
        s.sort();
        assert s.isSorted();
        s.show();
    }
}
