package j.edu.princeton.cs.cp2.arraylist.partion;

import j.edu.princeton.cs.cp2.arraylist.AbstractSort;

public class ShellSort extends AbstractSort {

    public ShellSort(Comparable[] a) {
        array = a;
    }

    @Override
    public void sort() {
        int N = array.length;
        int h = 1;
        while (h < N) h = 3 * h + 1; //1, 4, 13, 40....

        while (h >= 1) {
            //这里用的是插入排序方法
            for (int i = h; i < N; i++) {
                for (int j = i; j >= h && less(array[j], array[j - h]); j -= h) {
                    exch(j, j - h);
                }
            }
            h = h / 3;
        }
    }

    public static void main(String[] args) {
        ShellSort shellSort = new ShellSort(test);
        show(test);
        shellSort.sort();
        shellSort.show();
    }
}
