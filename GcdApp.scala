//Creating an object GcdApp to run directly as an app
object GcdApp{

//Defining the main function that takes Strings as run time arguments the return type is Unit
  def main(args: Array[String]): Unit = {
    
	//Defining a new function gcd that takes two args of type integer having return type as an integer
	def gcd(a: Int, b: Int): Int =
	
	//Using recursion to calculate GCD. If second arg is 0 then return the first arg as gcd. else 
	//calcaulate gcd by exchanging parameters with b in place of forst arg & remainder of a%b as second argument. 
      if (b == 0) a else gcd(b, a % b)

	//Checking if arguments passed to the program is equal to 2. If not, exit the program.  
    if (args.length != 2)
      {
		//Displaying the message to the user to pass two arguments.
        print("Pass two args for gcd")
      }
    else
    {
	//Else, Displaying both the input args & calcaulate gcd by passing both the input arguments.
      println("First Number is " + args(0) + "!")
      println("Second Number is " + args(1) + "!")
	  
	  //recursively calling gcd(args(0),args(1)) with both the arguments.
      println("GCD of the numbers:"+gcd(args(0).toInt,args(1).toInt))
    }
  }
}