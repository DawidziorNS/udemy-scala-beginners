package lectures.part1basics

object ValuesVariablesTypes extends App {

  // values
  val x: Int = 42
  println(x)

  // x = 2
  // Vals are immutable!

  val xInfer = 42
  println(xInfer)

  // Compiler can infer types

  val aString: String = "hello"
  val anotherString: String = "goodbye"

  // Semicolons are optional. You must use it, when you have in one line multiple instruction what is bad practice

  val aBoolean: Boolean = true
  val aChar: Char = 'a'
  val anInt: Int = x // 4 bytes
  val aShort: Short = 32767 // 2 bytes
  val aLong: Long = 9223372036854775807L // 8 bytes (all with sign)
  val aFloat: Float = 2.0f // 4 bytes
  val aDouble: Double = 3.14 // consistent with Java syntax. 8 bytes

  // variables
  var aVariable: Int = 4
  aVariable = 5

  // variables are mutable
  // functional programming involves working less with variables

}
