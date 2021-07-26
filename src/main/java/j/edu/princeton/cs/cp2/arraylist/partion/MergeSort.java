package j.edu.princeton.cs.cp2.arraylist.partion;

import j.edu.princeton.cs.cp2.arraylist.AbstractSort;

public class MergeSort extends AbstractSort {

    protected Comparable[] aux;

    public MergeSort(Comparable[] a) {
        array = a;
        aux = new Comparable[a.length];
    }


    /**
     * 将 lo到mid mid到hi merge到一个数组中去
     *
     * @param lo
     * @param hi
     * @param mid
     */
    public void merge(int lo, int hi, int mid) {
        for (int t = lo; t <= hi; t++) {
            aux[t] = array[t];
        }
        int i = lo;
        int j = mid + 1;
        for (int k = lo; k <= hi; k++) {
            if (i > mid) {
                array[k] = aux[j++];
            } else if (j > hi) {
                array[k] = aux[i++];
            } else {
                array[k] = less(aux[i], aux[j]) ? aux[i++] : aux[j++];
            }
        }
    }

    private void sort(int lo, int hi) {
        if (hi <= lo)
            return;
        int mid = lo + (hi - lo) / 2;
        sort(lo, mid);
        sort(mid + 1, hi);
        merge(lo, hi, mid);
    }


    @Override
    public void sort() {
        int N = array.length;
        sort(0, N - 1);
    }


    public static void main(String[] args) {
        MergeSort sort = new MergeSort(test);
        show(test);
        sort.sort();
        sort.show();
    }
}
