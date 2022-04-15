package lectures.part1basics

import scala.annotation.tailrec

object Recursion extends App {
  def factorial(n: Int): Int = {
    if (n <= 1)
      1
    else
      n * factorial(n - 1)
  }

  def factorial_talrec(n: Int): BigInt = {
    def factHelper(x: Int, accumulator: BigInt): BigInt = {
      if (x <= 1)
        accumulator
      else
        factHelper(x - 1, x * accumulator)
    }

    factHelper(n, 1)
  }

  println(factorial_talrec(10))


  /**
   * Exercises
   * 1. Concatenate a string n times using tail recursion.
   * 2. IsPrime function tail recursion.
   * 3. Fibonacci - tail recursion.
   */

  //  def concatenateStrings(str: String, n: Int): String = {
  //    //    if (n<=1)
  //    //      str
  //    //    else
  //    //      concatenateStrings(str, n - 1)
  //    def concatHelper(accumulator: String, n: Int): String = {
  //      if (n <= 1) accumulator else concatHelper(str +, n - 1)
  //    }
  //
  //    concatHelper(str, 1)
  //  }

  @tailrec
  def concatenateTailRec(aString: String, n: Int, accumulator: String): String = {
    if (n <= 0)
      accumulator
    else
      concatenateTailRec(aString, n - 1, aString + accumulator)
  }


  println(concatenateTailRec("Kumar ", 5, ""))


  def isPrime(n: Int) : Boolean = {
   def isPrimeTailrec(t: Int, isStillPrime: Boolean) : Boolean = {
     if(!isStillPrime) false
     else if (t<=1) true
     else
       isPrimeTailrec(t -1, n%t != 0 && isStillPrime)
   }
    isPrimeTailrec(n / 2, true)
  }

  println(isPrime(7))


  def fibonacci(n: Int) : Int = {
    def fiboTailrec(i: Int, last: Int, nextToLast: Int) : Int = {
      if (i>=n) last
      else
        fiboTailrec(i + 1, last + nextToLast, last)

    }
    fiboTailrec(2, 1, 1)
  }
}
