package moon.star

import scala.collection.mutable.ArrayBuffer

object Driver {
  def main(args: Array[String]): Unit = {
   new MoveZeroes().moveZeroes(Array(0,1,0,3,12)).foreach(print(_))
  }
}
