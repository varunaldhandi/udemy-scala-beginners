package lectures.part1basics

object DefaultAndNamedArguments extends App {
  def trFact(n: Int, acc: Int = 1) : Int = {
    if(n<=1)
        acc
    else
      trFact(n-1, n * acc)
  }
  println(trFact(10))

  def greet(name: String = "Alex", age: Int = 24) = s"Hi, I'm ${name} and I'm ${age} years old !"

  println(greet(name = "Varun"))
}
