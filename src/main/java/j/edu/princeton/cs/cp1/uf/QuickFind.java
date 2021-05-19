package j.edu.princeton.cs.cp1.uf;

/**
 * 快速查找
 */
public class QuickFind extends AbstractUF {

    public QuickFind(int n) {
        super(n);
    }

    @Override
    public void union(int p, int q) {
        int pId = id[p];
        int qId = id[q];
        if (pId != qId) {
            for (int i = 0; i < id.length; i++) {
                if (id[i] == pId) {
                    id[i] = qId;
                 }
            }
        }
    }

    @Override
    public int find(int p) {
        return id[p];
    }
}
