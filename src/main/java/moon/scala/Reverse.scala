package moon.scala

class Reverse {
  def reverse(x: Int): Int = {
    var reverse = ""
    try{
      if (x > 0) {
      val length = x.toString.length
      val str=x.toString
      for (i <- 0 until length) {
        reverse = reverse+str(length - i - 1)
      }
      reverse.toInt
    } else {
      val length = (-x).toString.length
      val str=(-x).toString
      for (i <- 0 until length) {
        reverse = reverse+str(length - i - 1)
      }
      -reverse.toInt
    }
    }catch {
      case _:Exception=>0
    }

  }
}