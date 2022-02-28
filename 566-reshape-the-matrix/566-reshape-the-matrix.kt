class Solution {
    fun matrixReshape(mat: Array<IntArray>, r: Int, c: Int): Array<IntArray> {
        val m = mat.size
        val n = mat[0].size
        
        if(m*n==r*c) {
            val matList = ArrayList<Int>()
            for (i in 0..m - 1) {
                for (j in 0..n - 1) {
                    matList.add(mat[i][j])
                }
            }

            val result = Array(r) { i -> IntArray(c, { j -> matList.get(j + (i * c)) }) }

            return result
        }
        return mat
    }
}