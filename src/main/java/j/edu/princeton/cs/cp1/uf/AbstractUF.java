package j.edu.princeton.cs.cp1.uf;

/**
 * edu.princeton.cs.cp2.uf
 * Created by hefuduo on 5/19/21.
 */
public abstract class AbstractUF implements UF {
    protected int[] id;
    protected int count;

    public AbstractUF(int n) {
        id = new int[n];
        for (int i = 0; i < id.length; i++) {
            id[i] = i;
        }
        count = n;
    }

    public void validate(int p) throws Exception {
        if (p < 0 || p > id.length) {
            throw new Exception("p超出了数组的范围");
        }
    }

    @Override
    public boolean connected(int p, int q) {
        return find(p) == find(q);
    }

    @Override
    public int count() {
        return count;
    }
}
