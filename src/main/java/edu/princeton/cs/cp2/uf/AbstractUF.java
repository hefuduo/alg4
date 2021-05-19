package edu.princeton.cs.cp2.uf;

/**
 * edu.princeton.cs.cp2.uf
 * Created by hefuduo on 5/19/21.
 */
public abstract class AbstractUF implements UF {
    protected int[] id;
    protected int count;


    @Override
    public int count() {
        return count;
    }
}
