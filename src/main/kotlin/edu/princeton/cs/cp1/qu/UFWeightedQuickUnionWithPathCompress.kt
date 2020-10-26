package edu.princeton.cs.cp1.qu

import edu.princeton.cs.cp1.UFAbstract

/**edu.princeton.cs.cp1.qu
 * Created by hefuduo on 10/26/20.
 */
class UFWeightedQuickUnionWithPathCompress(n: Int) : UFWeightedQuickUnion(n) {


    override fun union(p: Int, q: Int) {
        val i = find(p)
        val j = find(q)
        if (sz[i] < sz[j]) {
            id[i] = j
            sz[j] += sz[i]
        } else {
            id[j] = i
            sz[i] += sz[j]
        }
    }

    override fun find(p: Int): Int {
        var root = p
        while (root != id[root])
            root = id[root]

        var tempP = p
        while (tempP != id[tempP]) {
            val newP = id[tempP]
            id[tempP] = root
            tempP = newP
        }
        return root
    }
}
