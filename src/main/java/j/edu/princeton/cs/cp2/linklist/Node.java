package j.edu.princeton.cs.cp2.linklist;

import org.jetbrains.annotations.NotNull;

public class Node<T extends Comparable<T>> implements Comparable<Node<T>> {
    public T data;
    public Node<T> next;

    public Node(T data) {
        this.data = data;
    }

    @Override
    public int compareTo(@NotNull Node<T> o) {
        return this.data.compareTo(o.data);
    }
}
