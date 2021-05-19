package j.edu.princeton.cs.cp1.uf;

import java.util.Arrays;

public class WeightedQuickUnionByHeight extends AbstractUF {

    private int[] height;

    public WeightedQuickUnionByHeight(int n) {
        super(n);
        height = new int[n];
        Arrays.fill(height, 0);
    }

    @Override
    public void union(int p, int q) {
        try {
            validate(p);
            validate(q);
        } catch (Exception e) {
            e.printStackTrace();
        }
        int i = find(p);
        int j = find(q);
        if (i == j)
            return;
        if (height[i] < height[j]) {
            id[i] = j;
        } else if (height[i] > height[j]) {
            id[j] = i;
        } else {
            id[i] = j;
            height[i]++;
        }
        count--;
    }

    @Override
    public int find(int p) {
        try {
            validate(p);
        } catch (Exception e) {
            e.printStackTrace();
        }
        while (p != id[p]) {
            p = id[p];
        }
        return p;
    }
}
