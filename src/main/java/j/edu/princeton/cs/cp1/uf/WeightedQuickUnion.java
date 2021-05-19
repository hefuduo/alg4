package j.edu.princeton.cs.cp1.uf;

import java.util.Arrays;

/**
 * 权重quick  union , 小的森林链接到大的森林.
 */
public class WeightedQuickUnion extends AbstractUF {

    private int sz[]; //size of component for roots.

    public WeightedQuickUnion(int n) {
        super(n);
        sz = new int[n];
        Arrays.fill(sz, 1);
    }

    @Override
    public void union(int p, int q) {
        int i = find(p);
        int j = find(q);
        if (i == j)
            return;
        if (sz[i] < sz[j]) {
            id[i] = j;
            sz[i] += sz[j];
        } else {
            id[j] = i;
            sz[j] += sz[i];
        }
    }

    @Override
    public int find(int p) {
        while (p != id[p]) {
            p = id[p];
        }
        return p;
    }
}
