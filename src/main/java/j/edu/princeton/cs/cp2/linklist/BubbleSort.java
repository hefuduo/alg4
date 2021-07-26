package j.edu.princeton.cs.cp2.linklist;

/**
 * 依次交换相邻节点的两个值.
 */
public class BubbleSort extends AbstractSort {
    @Override
    public void sort() {
        //先找到尾结点
        Node<Integer> tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }
        int swap;
        //循环为tail一致向前移动,直到tail = head 排序完成
        while (tail != head) {
            //pre cur 就像两个合并的小窗子,一致在移动,直到cur = tail停止.
            Node<Integer> pre = head;
            Node<Integer> cur = head.next;
            while (cur != tail) {
                if (pre.data > cur.data) {
                    swap(pre, cur);
                }
                pre = pre.next;
                cur = cur.next;
            }
            tail = pre;
        }
    }

    public void swap(Node<Integer> a, Node<Integer> b) {
        int temp = a.data;
        a.data = b.data;
        b.data = temp;
    }

    @Override
    public boolean isSorted() {
        return false;
    }

    public static void main(String[] args) {
        BubbleSort sort = new BubbleSort();
        sort.show();
        sort.sort();
        sort.show();
    }
}
