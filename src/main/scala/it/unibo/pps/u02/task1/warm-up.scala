package it.unibo.pps.u02.task1

@main
def main(): Unit =
  println("Hello Scala")

  // mult
  def mult(x: Double, y: Double): Double = x * y

  def curriedMult(x: Double)(y: Double): Double = x * y

  val multiplyBy3 = curriedMult(3)
  println(multiplyBy3(4))

  // division
  def divide(x: Double, y: Double): Double = x / y

  println(divide(3, 4))
  println(divide(3, 0))

  def curriedDivide(x: Double)(y: Double): Double = x / y

  println(curriedDivide(3)(4))
  val divide3By = curriedDivide(3)
  println(divide3By(4))