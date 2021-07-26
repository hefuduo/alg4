package j.edu.princeton.cs.cp2.linklist;

import j.edu.princeton.cs.cp2.Sort;

public abstract class AbstractSort implements Sort {
    public static Node<Integer> head = null;

    static {
        //init the test and shuffle the test.
        head = new Node<>(0);
        Node<Integer> temp = head;
        for (int i = 1; i < 20; i++) {
            temp.next = new Node<>(i);
            temp = temp.next;
        }
        temp.next = null;
        //shuffle three times
        for (int i = 0; i < 3; i ++)
            head = shuffle(head);
    }

    @Override
    public void show() {
        StringBuilder builder = new StringBuilder();
        Node<Integer> temp = head;
        while (temp != null) {
            builder.append(temp.data).append("-->");
            temp = temp.next;
        }
        builder.append("null");
        System.out.println(builder.toString());
    }

    /**
     * 洗牌
     *
     * @param head
     */
    public static <P extends Comparable<P>> Node<P> shuffle(Node<P> head) {
        //找到中点
        Node<P> tempHead = head;
        Node<P> slow = tempHead;
        Node<P> fast = tempHead.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        //将两个链表拆开
        Node<P> left = tempHead;
        Node<P> tempL = left;
        Node<P> right = slow.next;
        Node<P> tempR = right;
        slow.next = null;
        //将一边插入到另一边
        while (right != null && right.next != null) {
            tempL = left.next;
            tempR = right.next;
            left.next = right;
            right.next = tempL;
            left = tempL;
            right = tempR;
        }
        //边界条件
        if (right != null) {
            left.next = right;
        }
        return head;
    }
}
