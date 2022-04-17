package lectures.part1basics

object StringOps extends App {
  val str: String = "Hello, I am learning scala"
  println(str.charAt(2))
  println(str.substring(7,11))
  println(str.split(" ").toList)
  println(str.startsWith("Hello"))
  println(str.replace(" ","-"))
  println(str.toLowerCase())
  println(str.toUpperCase())
  println(str.length)

  val aNumberString = "2"
  val aNumber = aNumberString.toInt
  println(aNumber)

  // +: -> prepending and :+ -> appending
//  println('a' +: aNumber :+ 'z')
  println(str.reverse)
  println(str.take(2))

  // S - Interpolators
  val name = "David"
  val age = 12
  val greeting = s"Hello, my name is ${name} and I am ${age} years old !!"
  val anotherGreeting = s"Hello, my name is ${name} and I am ${age +1} years old !!"


  println(greeting)
  println(anotherGreeting)

  // F - Interpolators
  val speed = 1.2f
  val myth = f"${name} can eat $speed%2.2f burgers per minute"
  println(myth)

  //raw interpolators
  println(raw"This is a \n new line")
  // This is a \n new line

  val escaped = "This is a \n new line"
  println(raw"${escaped}")

  // This is a
  // new line
}
