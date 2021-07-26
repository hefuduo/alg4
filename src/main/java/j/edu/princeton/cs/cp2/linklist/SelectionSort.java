package j.edu.princeton.cs.cp2.linklist;

/**
 * (1) 找到最小的与当前的交换
 * (2) 当前循环到链表结尾
 */
public class SelectionSort extends AbstractSort{
    @Override
    public void sort() {
        Node<Integer> curNode = head;
        int min;
        while (curNode != null) {
            Node<Integer> next = curNode.next;

            while (next != null) {
                if (curNode.data > next.data) {
                    min = curNode.data;
                    curNode.data = next.data;
                    next.data = min;
                }
                next = next.next;
            }
            curNode = curNode.next;
        }
    }

    @Override
    public boolean isSorted() {
        return false;
    }

    public static void main(String[] args) {
        SelectionSort sort = new SelectionSort();
        sort.show();
        sort.sort();
        sort.show();
    }
}
