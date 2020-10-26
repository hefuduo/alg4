package edu.princeton.cs.cp1.qu

import edu.princeton.cs.cp1.UFAbstract

/**edu.princeton.cs.cp1.qu
 * Created by hefuduo on 10/26/20.
 */
class UFWeightedQuickUnionByHeight(n: Int) : UFAbstract(n) {

    private lateinit var height: IntArray // height[i] height of subtree rooted at i


    init {
        count = n //初始化为n个向量
        for (i in 0 until n) {
            height[i] = 0
        }
    }

    override fun union(p: Int, q: Int) {
        val i = find(p)
        val j = find(q)
        if (i == j) //同一组
            return
        if (height[i] < height[j]) {
            id[i] = j //i树的高度小于j树, 将i树的根赋值j树的根节点
        } else if (height[i] > height[j]) {
            id[j] = i
        } else {
            //两树高度相同
            id[j] = i;
            height[j]++
//            or same as above
//            id[i] = j
//            height[i] ++
        }
        count--
    }

    override fun find(p: Int): Int {
        var tempP = p;
        while (tempP != id[tempP]) {
            tempP = id[tempP];
        }
        return tempP;
    }

}
