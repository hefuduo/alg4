package j.edu.princeton.cs.cp2.arraylist.elementsort;

import j.edu.princeton.cs.cp2.arraylist.AbstractSort;

public class BubbleSort extends AbstractSort {

    public BubbleSort(Comparable[] a) {
        array = a;
    }


    @Override
    public void sort() {
        int N = array.length;
        for (int i = N - 1; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                if (less(array[j + 1], array[j])) {
                    exch(j + 1, j);
                }
            }
        }
    }


    public static void main(String[] args) {
        BubbleSort sort = new BubbleSort(test);
        sort.sort();
        sort.show();
    }
}
