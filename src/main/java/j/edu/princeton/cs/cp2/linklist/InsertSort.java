package j.edu.princeton.cs.cp2.linklist;

/**
 * 插入排序,将头节点插入到新的一个temp节点中,依次将剩余的节点,插入到新的链表中, 返回tempHead.next作为头节点
 */
public class InsertSort extends AbstractSort {
    @Override
    public void sort() {
        //一个新的节点的链表, 新建一个头节点,将head中的值依次插入到这个链表中
        Node<Integer> tempHead = new Node<>(null);
        Node<Integer> cur = head.next;
        //先把头结点解出来
        tempHead.next = head;
        head.next = null;

        while (cur != null) {
            //每次解一个节点
            Node<Integer> tempCur = cur;
            cur = cur.next;

            //吧tempCur插入到tempHead中去.
            Node<Integer> prev = tempHead;
            Node<Integer> index = tempHead.next;

            while (index!= null && index.data < tempCur.data ) {
                prev = prev.next;
                index = index.next;
            }
            //插入到位置中
            prev.next = tempCur;
            tempCur.next = index;
        }
        head = tempHead.next;
    }


    @Override
    public boolean isSorted() {
        return false;
    }

    public static void main(String[] args) {
        InsertSort sort = new InsertSort();
        sort.show();
        sort.sort();
        sort.show();
    }
}
