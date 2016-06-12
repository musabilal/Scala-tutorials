/**
  * Created by musa.bilal on 12/06/2016.
  */


object factorial_HOF {
  def factorial(n:Int):Int = {
    def go(n:Int,acc:Int):Int = {
      if (n <= 0) acc
      else go(n-1,n*acc)
    }
    go(n,1)
  }
  def main(args:Array[String]):Unit ={
    println("Hello World")
    println(factorial(10))
  }
}