class Solution {
    fun maxProfit(prices: IntArray): Int {
        var bestSell = if(prices.size>1) prices[1] - prices[0] else 0
        var minBuy = prices[0]

        for(i in 1..prices.lastIndex){
            if(minBuy>prices[i]) minBuy = prices[i]
            if((prices[i]-minBuy)>bestSell) bestSell = prices[i] - minBuy
        }

        return bestSell
    }
}