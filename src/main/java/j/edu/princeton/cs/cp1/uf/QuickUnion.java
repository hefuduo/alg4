package j.edu.princeton.cs.cp1.uf;

/**
 * quick union提高union的效率, 森林表示法
 */
public class QuickUnion extends AbstractUF {
    public QuickUnion(int n) {
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
        int pRoot = find(p);
        int qRoot = find(q);
        if (pRoot != qRoot) {
            id[pRoot] = qRoot;
        }
        //最后别忘了减小分组数量
        count--;
    }

    @Override
    public int find(int p) {
        try {
            validate(p);
        } catch (Exception e) {
            e.printStackTrace();
        }
        while (id[p] != p) {
            p = id[p];
        }
        return p;
    }
}
