package lectures.part1basics

object ValuesVariablesTypes extends App {
  val x: Int = 42
  println(x)

  val y = 53 // The type is inferred automatically even if the data type is not mentioned in the declaration.
  //VALS ARE IMMUATABLE

  val aString : String = "hello"
  val aBoolean: Boolean = false
  val aChar: Char = 'a'
  val anInt: Int = 42
  val aShort: Short = 3541
  val aLong: Long = 56316541654646L
  val aFloat: Float = 2.15f
  val aDouble: Double = 3.14

  //Variables
  var a = 12
  a = 67
}
