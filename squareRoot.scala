//Creating an object squareRoot
object squareRoot {
  // squareroot function to find the square root of a number using Babylonian method
  def squareroot(n:BigDecimal): Stream[BigDecimal] =
  {
    def squareroot(x:BigDecimal , n:BigDecimal): Stream[BigDecimal] = {
      Stream.cons(x,squareroot(0.5*(x + n /x),n))}
    // to find squareroot of x, we will add x with n(root number) and multiply the result //with 0.5
  squareroot(1,n)}
  squareroot(2 )// streaming 5 iterations to find squareroot
  val iterations = 5
  squareroot(2)(iterations-1)
  squareroot(2).take(iterations).toList

  def squareRoot(n: Double): Double = {
    var x:Double =n
    var y:Double = 1
    val e:Double = 0.000001
    while(x-y>e){
      x = (x+y)/2
      y=n/x} // while loop to find the squareroot
    x
  }
  //Defining the main function that is the starting point of this application. Calling fib() function & the return type is Unit
  def main(args: Array[String]): Unit = {
    // Calling the “squareroot” function to execute the square root of 12.1234556
    println(squareRoot(12.8567493))
  }
}