package lectures.part1basics

object Functions extends App {
  def aFunction(a: String, b: Int): String = {
    a + " " + b
  }

  def aParameterLessFunction() = 42

  println(aParameterLessFunction())
  println(aParameterLessFunction)

  //  A recursive function
  def aRecursiveFunction(aString: String, n: Int): String = {
    if (n == 1)
      aString
    else
      aString + " " + aRecursiveFunction(aString, n - 1)
  }

  println(aRecursiveFunction("Varun", 5))
  // WHEN YOU NEED LOOPS, USE RECURSION

  def aFunctionWithSideEffects(aString: String) = println(aString)


  // An auxiliary function can also be declared inside another function definition
  def aBigFunction(n: Int): Int = {
    def aSmallerFunction(a: Int, b: Int) = a + b

    aSmallerFunction(n, n - 1)
  }

  /**
   * Exercises
   * 1. A greeting function (name, age) => "Hi, my name is $name and I am $age years old"
   * 2. Factorial function 1 * 2 * 3 * ... * n
   * 3. A fibonacci function - 1, 1, 2, 3, 5,
   * 4. Function to test if a number is prime
   */

  def greet(name: String, age: Int) = s"Hi, my name is ${name} and I am ${age} years old."

  def factorial(n: Int) : Int = {
    if (n == 1)
      1
    else
      n * factorial(n-1)
  }



  println(factorial(3))
  def fibonacci(n: Int) : Int = {
    if(n <= 2)
      1
    else
      fibonacci(n - 1) + fibonacci(n - 2)
  }

  println(fibonacci(4))

  def isPrime(n: Int) : Boolean = {
    def isPrimeUntil(t: Int) : Boolean = {
      if(t <= 1)
        true
      else
        n%t != 0 && isPrimeUntil(t-1)
    }
    isPrimeUntil(n/2)
  }




  println(isPrime(5))
  println(isPrime(10))
  println(isPrime(7))
}
