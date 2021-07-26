package j.edu.princeton.cs.cp2.arraylist;

public class HeapSort extends AbstractSort {

    //大顶堆, K 的左孩子 2*k+1; 他的右孩子2*(K+1),从 0 开始.
    public HeapSort(Comparable[] a) {
        array = a;
    }


    private void sink(int k, int n) {
        while (2 * k <= n) { //注意条件.
            int j = 2 * k;
            if (j < n && less(array[j], array[j + 1])) j++; //注意条件
            if (less(array[j], array[k]))
                break;
            else {
                exch(j, k);
                k = j;
            }
        }
    }

    private void swim(int k) {
        while (k > 1) {
            if (less(array[k / 2], array[k])) {
                exch(k / 2, k);
                k = k / 2;
            }else
                break;
        }
    }

    @Override
    public void sort() {
        int N = array.length;
        for (int i = N / 2; i >= 1; i--) {
            sink(i, N - 1);
        }
        int n = N - 1;
        while (n >= 1) {
            exch(1, n--);
            sink(1, n);
        }
    }

    public static void main(String[] args) {
        HeapSort sort = new HeapSort(test);
        show(test);
        sort.sort();
        sort.show();
    }
}
