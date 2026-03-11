package it.unibo.pps.u02.task2

@main
def es5(): Unit =
  composition()

// composition
def composition(): Unit =
  def c1(f: Int => Int, g: Int => Int): Int => Int = x => f(g(x))
  println(c1(_ - 1, _ * 2)(5))
  val f: Int => Int = x => x + 1
  val g: Int => Int = x => x - 2
  val decrease = c1(f, g)
  println(decrease(3))

  val increase = c1(_ - 1, _ + 2)
  println(increase(2))

  val c2: (Int => Int, Int => Int) => Int => Int = (f, g) => x => f(g(x))

  println(c2(_ - 1, _ * 2)(5))






