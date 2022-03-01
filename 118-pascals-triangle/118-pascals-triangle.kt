class Solution {
    fun generate(numRows: Int): List<List<Int>> {
        var pascal = MutableList(numRows) { i -> MutableList(i+1){1} } // numRows에 맞는 size의 가변 list 생성, 1로 초기화

        for(row in 0..numRows-1){ 
            for(column in 0..row){
                if(column!=0&&column!=row) {    // 각 행의 첫 번째와 마지막 Index는 1이므로 나머지 요소만 접근하여 값 대입
                    pascal[row][column]=pascal[row - 1][column - 1] + pascal[row - 1][column]
                }
            }
        }

        return pascal
    }
}