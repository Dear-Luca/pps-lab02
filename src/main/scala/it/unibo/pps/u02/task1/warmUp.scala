package it.unibo.pps.u02.task1

@main
def es2(): Unit =
  println("Hello Scala")
  // mult
  def mult(x: Double, y: Double): Double = x * y
  def curriedMult1(x: Double)(y: Double): Double = x * y

  val multiplyBy3 = curriedMult1(3)
  println(multiplyBy3(4))

  val curriedMult2: Double => (Double => Double) = x => (y => (x * y))

  val multiplyBy4: Double => Double = curriedMult2(4)
  println(multiplyBy4(5))

  // division
  def divide(x: Double, y: Double): Double = x / y
  println(divide(3, 4))
  println(divide(3, 0))

  def curriedDivide1(x: Double)(y: Double): Double = x / y
  println(curriedDivide1(3)(4))
  val divide3By = curriedDivide1(3)
  println(divide3By(4))

  val curriedDivide2: Double => Double => Double = x => y => x / y
  println(curriedDivide2(10)(2))