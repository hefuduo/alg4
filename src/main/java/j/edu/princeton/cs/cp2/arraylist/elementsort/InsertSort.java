package j.edu.princeton.cs.cp2.arraylist.elementsort;

import j.edu.princeton.cs.cp2.arraylist.AbstractSort;

import java.util.Arrays;

public class InsertSort extends AbstractSort {


    public InsertSort(Comparable[] a) {
        array = a;
    }

    @Override
    public void sort() {
        int N = array.length;
        for (int i = 1; i < N; i++) {
            for (int j = i; j >= 1; j--) {
                if (less(array[j], array[j - 1])) {
                    exch(j, j - 1);
                } else break;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(test));
        InsertSort s = new InsertSort(test);
        s.sort();
        s.show();
    }
}
