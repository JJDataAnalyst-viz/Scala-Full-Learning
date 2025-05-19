import java.util.Date

package object PA_Function
import java.time.LocalTime
object pa_function {

  def log(date: Date,message : String) = {
    println(date.toString + " " + message)
  }


  def main(args:Array[String]):Unit = {
      val sum = (a:Int,b:Int,c:Int)  => a + b + c
      val pa_sum = sum(10,20, _ : Int)
      println(pa_sum(6))
    // PA Functions can be handy when it comes to reusability of function
      val date = new Date
      val log_now = log(date,_)

  }
}
