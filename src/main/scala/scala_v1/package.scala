package object scala_v1
// Partially Applied Functions

object scaler {
  def main(args:Array[String]):Unit = {
      val sum = (a:Int,b:Int) => a + b
      println(sum(1,2))

  }
}
