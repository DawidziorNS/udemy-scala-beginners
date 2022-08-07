package lectures.part1basics

import scala.annotation.tailrec

object Recursion extends App {

  def factorial(n: Int): Int = {
    if (n <= 1) 1
    else {
      println("Computing factorial of " + n + " - I first need factorial of " + (n - 1))
      val result = n * factorial(n - 1)
      // JVM before go to second print, need to calculate all values! It easy to get StackOverflowException
      println("Computed factorial of " + n)

      result
    }
  }

  println(factorial(10))
  // println(factorial(50000)) StackOverflowException

  def anotherFactorial(n: Int): BigInt = {
    @tailrec // We should add this annotation. If function is not tail recursion we will get error
    def factHelper(x: Int, accumulator: BigInt): BigInt = {
      if (x <= 1) accumulator
      else factHelper(x - 1, x * accumulator) // It is called Tail recursion = use recursive call as the LAST expression!
    }
    factHelper(n, 1)
  }

  println(anotherFactorial(10))
  println(anotherFactorial(5000))

  // Second version won't return stackoverflow exception because it don't keep the expression value (n * fun() !)
  // WHEN YOU NEED LOOPS, USE _TAIL_ RECURSION

  @tailrec
  def concatenateTailrec(aString: String, n: Int, accumulator: String): String = {
    if (n <= 0) accumulator
    else concatenateTailrec(aString, n - 1, aString + accumulator)
  }

  println(concatenateTailrec("hello", 3, ""))

  def isPrime(n: Int): Boolean = {
    @tailrec
    def isPrimeTailrec(t: Int, isStillPrime: Boolean): Boolean = {
      if (!isStillPrime) false
      else if (t <= 1) true
      else isPrimeTailrec(t - 1, n % t != 0 && isStillPrime)
    }
    isPrimeTailrec(n / 2, true)
  }

  println(isPrime(2003))
  println(isPrime(629))

  def fibonacci(n: Int): Int = {
    @tailrec
    def fiboTailrec(i: Int, last: Int, nextToLast: Int): Int = {
      if (i >= n) last
      else fiboTailrec(i + 1, last + nextToLast, last)
    }

    if (n <= 2) 1
    else fiboTailrec(2, 1, 1)
  }

  println(fibonacci(8))

}
