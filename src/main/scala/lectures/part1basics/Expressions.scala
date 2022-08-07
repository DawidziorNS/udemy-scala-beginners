package lectures.part1basics

object Expressions extends App {

  val x = 1 + 2
  println(x)

  // 1 + 2 is an expression

  println(2 + 3 * 4)
  // + - * / & | ^ << >> >>>

  println(1 == x)
  // == != > >= < <=

  println(!(1 == x))
  // ! && ||

  var aVariable = 2
  aVariable += 3 // works with -= *= /= ... side effects
  println(aVariable)

  // Instructions (Do) vs Expressions
  // Instructions do something, Expressions is something that has a value and a type

  // if expression - gives back a value!
  val aCondition = true
  val aConditionedValue = if(aCondition) 5 else 3
  println(aConditionedValue)
  println(if(aCondition) 5 else 3)

  var i = 0
  while (i < 10) {
    println(i)
    i += 1
  }
  // While is also side effect (and return Unit)

  // Never write this again!
  // Everything in Scala is an expression!
  val aWeirdValue = (aVariable = 3) // Unit === void, reassigning a variable is a side effect (Side effect is expression returning unit)
  println(aWeirdValue) // Value of unit is always ()

  // side effects: println(), whiles, reassigning

  val aCodeBlock = {
    val y = 2
    val z = y + 1

    if (z > 2) "hello" else "goodbye"
  }

  // Code block is expression! Code block return last value. In this case String.
  println(aCodeBlock)

  // z and y is not visible here.

}
