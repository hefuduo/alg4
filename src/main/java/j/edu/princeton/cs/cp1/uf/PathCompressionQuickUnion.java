package j.edu.princeton.cs.cp1.uf;

public class PathCompressionQuickUnion extends AbstractUF {

    public PathCompressionQuickUnion(int n) {
        super(n);
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
        id[i] = j;
        count--;
    }

    @Override
    public int find(int p) {
        try {
            validate(p);
        } catch (Exception e) {
            e.printStackTrace();
        }
        int root = id[p];
        //在搜索的同时压缩了路径.
        while (p != root) {
            root = id[root]; //讲p节点的父节点换成父节点的父节点.(压缩路径)
            p = root;
        }
        return p;
    }
}
