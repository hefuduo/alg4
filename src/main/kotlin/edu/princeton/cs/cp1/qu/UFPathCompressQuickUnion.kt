package edu.princeton.cs.cp1.qu

import edu.princeton.cs.cp1.UFAbstract

/**edu.princeton.cs.cp1.qu
 * Created by hefuduo on 10/26/20.
 * 路径压缩
 */
class UFPathCompressQuickUnion : UFAbstract {

    constructor(n: Int) : super(n)

    constructor(id: IntArray) : super(id)

    override fun union(p: Int, q: Int) {
        val rootP = find(p);
        val rootQ = find(q);
        if (rootP == rootQ)
            return
        id[rootP] = rootQ; // 反过来也可以
        count--;
    }

    /**
     * 路径压缩关键算法
     *
     * @param p
     * @return
     */
    override fun find(p: Int): Int {
        var root = p
        //找到根节点
        while (root != id[root]) {
            root = id[root]
        }
        //把搜索路径上的所有parent节点都赋到root节点.
        var tempP = p;
        while (tempP != root) {
            val newP = id[tempP]
            id[tempP] = root
            tempP = newP
        }
        return root
    }

    /**
     * 另一种实现 path halving
     * 在遍历的同时压缩路径
     * @param p
     * @return
     */
    fun find2(p: Int): Int {
        var root = p
        while (root != id[root]) {
            id[root] = id[id[root]] //将节点赋给祖父节点.1
            root = id[root]
        }
        return root
    }

}
