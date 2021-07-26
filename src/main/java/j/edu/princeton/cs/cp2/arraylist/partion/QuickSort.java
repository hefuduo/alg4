package j.edu.princeton.cs.cp2.arraylist.partion;

import j.edu.princeton.cs.cp2.arraylist.AbstractSort;

public class QuickSort extends AbstractSort {

    public QuickSort(Comparable[] a) {
        array = a;
    }

    private int partion(int lo, int hi) {
        int i = lo;
        int j = hi + 1;
        while (true) {//循环
            while (less(array[++i], array[lo])) { //从 lo +1 到hi找到一个比lo大的
                if (i == hi) {
                    break;
                }
            }
            while (less(array[lo], array[--j])) { //从hi 到lo 找到一个比lo小的
                if (j == lo)
                    break;
            }
            if (i >= j) //两个指针相遇了
                break;
            exch(i, j);    //将两个值交换,使得lo左边的比lo小,右边的比lo大.
        }
        exch(j, lo);  // 将lo放到固定的位置上去.
        return j;
    }


    private void sort(int lo, int hi) {
        if (hi <= lo)
            return;
        int j = partion(lo, hi);
        sort(lo, j - 1);
        sort(j + 1, hi);
    }

    @Override
    public void sort() {
        int N = array.length;
        sort(0, N - 1);
    }


    public static void main(String[] args) {
        QuickSort quickSort = new QuickSort(test);
        show(test);
        quickSort.sort();
        quickSort.show();
    }
}
