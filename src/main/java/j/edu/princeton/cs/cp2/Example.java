package j.edu.princeton.cs.cp2;

import java.util.Arrays;

/**
 * j.edu.princeton.cs.cp2
 * Created by hefuduo on 5/20/21.
 */
public class Example {
    public static void sort(Comparable[] arr) {

    }

    public static boolean less(Comparable a, Comparable b) {
        return a.compareTo(b) < 0;
    }

    public static boolean isSorted(Comparable[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (less(arr[i], arr[i - 1])) {
                return false;
            }
        }
        return true;
    }

    public static void show(Comparable[] arr) {
        String s = Arrays.toString(arr);
        System.out.println(s);
    }
}
