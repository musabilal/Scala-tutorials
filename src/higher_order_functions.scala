/**
  * Created by musa.bilal on 12/06/2016.
  */


object higher_order_functions {

  def abs(n:Int):Int = {
    if (n<0) -n
    else n
  }

  def factorial(n:Int):Int = {
    def go(n:Int,acc:Int):Int = {
      if (n <= 0) -acc
      else go(n-1,n*acc)
    }
    go(n,1)
  }

  def formatAbs(x:Int) = {
    val msg = "The absolute value of %d is %d."
    msg.format(x,abs(x))
  }

/*
  private def formatFactorial(n:Int):Int = {
    val msg = "The factorial of %d is %d."
    msg.format(n,factorial(n))
  }
  */

  def formatResult(name:String,n:Int,f:Int=>Int) = {
    val msg = "The factorial of %d is %d"
    msg.format(name,n,f(n))
  }

  private def formatFactorial(n: Int) = {
    val msg = "The factorial of %d is %d" msg.format(n, factorial(n))
  }
  def main(args: Array[String]): Unit = {
    println(formatAbs(-42))
    println(formatFactorial(7))
  }

}