package edu.princeton.cs.cp1

/**union_find
 * Created by hefuduo on 6/29/20.
 */
abstract class UFAbstract(n: Int) : UF {

    protected var id: IntArray //分量的id,下标代表量,值代表分组

    protected var count: Int = 1   //分组数量

    init {
        count = n
        id = IntArray(n)
        id.forEachIndexed { index, _ ->
            id[index] = index
        }
    }

    constructor(id: IntArray) : this(id.size) {
        this.id = id
    }


    fun validate(x: Int): Unit {
        val n = id.size
        if (x < 0 || x > n) {
            throw Exception("index $n is out of array index")
        }
    }

    override fun connected(p: Int, q: Int): Boolean {
        return find(p) == find(q)
    }

    override fun count(): Int {
        return count
    }
}
