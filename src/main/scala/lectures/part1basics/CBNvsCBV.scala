package lectures.part1basics

object CBNvsCBV extends App {

  // Two values will be identical. Values is computed before the function evaluates.
  def calledByValue(x: Long): Unit = {
    println("by value: " + x)
    println("by value: " + x)
  }

  // Argument is passed as is, and is evaluated in every usage
  def calledByName(x: => Long): Unit = {
    println("by name: " + x)
    println("by name: " + x)
  }

  calledByValue(System.nanoTime())
  calledByName(System.nanoTime())

  def infinite(): Int = 1 + infinite()
  def printFirst(x: Int, y: => Int) = println(x)

  //printFirst(infinite(), 34) Stackoverflow
  printFirst(34, infinite()) // infinite is never used, so we don't have stackoverflow error

}
