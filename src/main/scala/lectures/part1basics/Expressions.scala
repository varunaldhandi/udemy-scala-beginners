package lectures.part1basics

object Expressions extends App {
  val x = 1 + 2
  println(x)
  println(2 + 3 * 4)
  //  + - * / & | ^ << >> >>>(Right shift with zero extensions)

  println(1 == x)
  println(!(1 == x)) // Negation
  //  ! && ||
  var aVariable = 2
  aVariable += 2 //also works with -= *= /= .. These are side effects
  println(aVariable)

  /**
   * Instructions (DO) vs Expressions (VALUE)
   * Instructions tell computer what to do
   * Expressions evaluate to a value
   */
  val aCondition = true
  val aConditionValue = if (aCondition) 5 else 3 //if expresion
  println(aConditionValue)
  println(if (aCondition) 5 else 3)

  val aWeirdValue = (aVariable = 1) //This returns a Unit type. Unit is void in other languages.
  println(aWeirdValue) //Unit always prints/returns ()

  // Any expression that returns Unit is a side effect
  //  Examples of side effects : println(), whiles, reassigning

  //  Code blocks
  val aCodeBlock = {
    val y = 2
    val z = y + 1
    if (z > 2) "Hello" else "GoodBye"
  }

  //  The return value of the code block is the last line of the code block
  println(aCodeBlock)

  /**
   * Exercises:
   * 1. "hello world" vs println("hello world")
   *
   */

  println("hello world".getClass)
  val someValue = {
    2 < 3
  }
  println(someValue)
  val someOtherValue  = {
    if(someValue) 239 else 986
    42
  }
  println(someOtherValue)

}

