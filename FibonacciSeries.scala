package Fibonacci

class FibonacciSeries()
{
  def fibonnacci_loop( n : Int ) : Int = {
  var a = 0
  var b = 1
  var i = 0	  
 
  while( i < n ) {
    val c = a + b
    a = b
    b = c
    i = i + 1
  } 
  return a
}
 def fibonnacci_recursion( n : Int) : Int = { 
  def fibonnacci_recursion_tail( n: Int, a:Int, b:Int): Int = n match {
    case 0 => a 
    case _ => fibonnacci_recursion_tail( n-1, b, a+b )
  }
  return fibonnacci_recursion_tail( n, 0, 1)
}
}

object FibonacciSeries {
  def main(args:Array[String]) :Unit = {
    var Fibonacci_series = new FibonacciSeries();
    println("Output for number 10 with loop is "+Fibonacci_series.fibonnacci_loop(10))
    println("output for number 10 with Recursion is "+ Fibonacci_series.fibonnacci_recursion(10))
  }
  
}