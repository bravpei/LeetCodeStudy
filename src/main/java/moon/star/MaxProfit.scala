package moon.star

class MaxProfit {
  def maxProfit(prices:Array[Int]): Int ={
      if(prices.length<=1){
        0
      }else{
        var profit=0
        for(i<-1 until prices.length){
          if(prices(i)>prices(i-1)){
            profit+=prices(i)-prices(i-1)
          }
        }
        profit
      }
  }
}
