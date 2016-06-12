/**
  * Created by musa.bilal on 12/06/2016.
  */
object simpleProgram {
  def abs(n:Int):Int = {
    if (n < 0) n
    else n
  }

  private def formatAbs(x:Int) = {
    val msg = "The absolute value of %d is %d"
    msg.format(x, abs(x))
  }

  def main(args:Array[String]):Unit = {
    println(formatAbs(-42))
  }

}


