package j.edu.princeton.cs.cp2.arraylist;

import j.edu.princeton.cs.cp2.Sort;
import j.edu.princeton.cs.cp2.tools.Knuth;

import java.util.Arrays;

/**
 * j.edu.princeton.cs.cp2
 * Created by hefuduo on 5/20/21.
 */
public abstract class AbstractSort implements Sort {

    protected Comparable[] array;

    public static Integer[] test = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    static {
        Knuth.shuffle(test);
    }

    @Override
    public abstract void sort();

    public static boolean less(Comparable a, Comparable b) {
        return a.compareTo(b) < 0;
    }

    @Override
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

    @Override
    public void show() {
        String s = Arrays.toString(array);
        System.out.println(s);
    }

    public static void show(Comparable[] array) {
        String s = Arrays.toString(array);
        System.out.println(s);
    }
}
