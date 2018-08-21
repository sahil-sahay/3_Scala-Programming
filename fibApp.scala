//Created an object singleton object fibApp to run this app directly.
object fibApp {
  //Declaring & defining a new function fib passing first arg as 0, second arg as 1, count as 2 & returning a list
  def fib(a: Int = 0, b: Int = 1, count: Int = 2): List[Int] = {
    //To calculate the next value we add first and second number
    val c = a + b
    //Stopping criteria, send back a list containing the latest value
    if (count >= 12) {
      List(c)
    }
    //If this is the first iteration create the first few fibonacci numbers, and make a recursive call
    //Adding one list to another is done using the ++ function
    else if (a == 0 && b == 1) {
      List(a, b, c) ++ fib(b, c, count + 1)
    }
    //If this wasn't the first iteration, just add the latest element at the beginning of the list and make the recursive call
    else {
      c +: fib(b, c, count + 1)
    }
  }
  //Defining the main function that is the starting point of this application. Calling fib() function & the return type is Unit
  def main(args: Array[String]): Unit = {
    //Since default values were passed as function parameters, it's not required to pass any when function is called.
    println(fib())
  }
}