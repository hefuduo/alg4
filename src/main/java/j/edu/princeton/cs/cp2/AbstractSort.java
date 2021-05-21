package j.edu.princeton.cs.cp2;

import java.util.Arrays;

/**
 * j.edu.princeton.cs.cp2
 * Created by hefuduo on 5/20/21.
 */
public abstract class AbstractSort {

    protected Comparable[] array;

    public abstract void sort();

    public static boolean less(Comparable a, Comparable b) {
        return a.compareTo(b) < 0;
    }

    public boolean isSorted() {
        for (int i = 1; i < array.length; i++) {
            if (less(array[i], array[i - 1])) {
                return false;
            }
        }
        return true;
    }

    public void exch(int a, int b) {
        Comparable temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }

    public void show() {
        String s = Arrays.toString(array);
        System.out.println(s);
    }
}
