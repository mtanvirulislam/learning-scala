package exercises


object Fibonacci {
  def main(args: Array[String]){
    val numFibonacci = fibs().take(10) 
    numFibonacci.foreach(println)
  }
  //Function
  def fibs(a: Int = 0, b: Int = 1): Stream[Int] ={
    Stream.cons(a, fibs(b, a+b))
  }
}