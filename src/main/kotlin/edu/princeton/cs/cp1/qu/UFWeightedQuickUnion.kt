package edu.princeton.cs.cp1.qu

import edu.princeton.cs.cp1.UFAbstract

/**edu.princeton.cs.cp1.qu
 * Created by hefuduo on 10/26/20.
 * 带权重
 */
open class UFWeightedQuickUnion(n: Int) : UFAbstract(n) {

    /**
     * 代表每个根节点包含的节点数量
     */
    lateinit var sz: IntArray

    init {
        for (i in id.indices) {
            sz[i] = 1
        }
    }

    override fun union(p: Int, q: Int) {
        var i = find(p)
        var j = find(q)
        if (i == j)
            return
        if (sz[i] < sz[j]) {
            id[i] = j //谁大谁做根节点
            sz[j] += sz[i] //更新节点
        } else {
            id[j] = i
            sz[i] += sz[j] //更新节点
        }
    }

    override fun find(p: Int): Int {
        var tempP = p
        while (tempP != id[tempP])
            tempP = id[tempP]
        return tempP
    }

}
