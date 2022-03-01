class Solution {
    fun isValidSudoku(board: Array<CharArray>): Boolean {
        var rowCheck = HashMap<Int,Int>()
        var colCheck = Array(9){HashMap<Int,Int>()}
        var boxCheck = Array(3){HashMap<Int,Int>()}

        var value = 0

        for(i in 0..8){
            for(j in 0..8){
                println("i: $i, j: $j, value: $value")
                if(!board[i][j].equals('.')){
                    value = board[i][j].toString().toInt()
                        println("value $value in $j col, ${i/3+j/3} box")

                    if(rowCheck.containsKey(value)||colCheck[j].containsKey(value)||boxCheck[j/3].containsKey(value))
                        return false
                    else{
                        rowCheck.put(value,1)
                        colCheck[j].put(value,1)
                        boxCheck[j/3].put(value,1)
                    }
                }
                if(i%3==2&&j==8){
                        boxCheck[0].clear()
                        boxCheck[1].clear()
                        boxCheck[2].clear()
                    }

            }
            rowCheck.clear()
        }
        return true
    }
}