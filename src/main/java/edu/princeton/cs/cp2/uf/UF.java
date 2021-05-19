package edu.princeton.cs.cp2.uf;

/**
 * edu.princeton.cs.cp2
 * Created by hefuduo on 5/19/21.
 */
public interface UF {
    void union(int p, int q);

    int find(int p);

    boolean connected(int p, int q);

    int count();
}
