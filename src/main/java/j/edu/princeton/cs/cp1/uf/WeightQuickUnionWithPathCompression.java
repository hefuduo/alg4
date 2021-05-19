package j.edu.princeton.cs.cp1.uf;

/**
 * 带路径压缩的
 */
public class WeightQuickUnionWithPathCompression extends WeightedQuickUnion {

    public WeightQuickUnionWithPathCompression(int n) {
        super(n);
    }

    @Override
    public void union(int p, int q) {
        super.union(p, q);
    }

    @Override
    public int find(int p) {
        try {
            validate(p);
        } catch (Exception e) {
            e.printStackTrace();
        }
        int root = id[p];
        while (p != root) {
            root = id[root];
            p = root;
        }
        return p;
    }
}
