package it.unibo.pps.u02.part2

@main
def es3(): Unit =
  positive()
  neg()


def positive(): Unit =
  def positive1(x: Int): String = x match
    case x if x >= 0 => "positive"
    case _ => "negative"


  val positive2: Int => String = _ match
    case n if n >= 0 => "positive"
    case _ => "negative"

  println(positive1(-9))
  println(positive2(9))

def neg(): Unit =
  def empty1(string: String): Boolean = string == ""
  println(empty1("ciao"))

  def neg1(predicate: String => Boolean): String => Boolean = string => !predicate(string)

  val notEmpty1 = neg1(empty1)
  println(notEmpty1("ciao"))
  println(notEmpty1(""))
  println(notEmpty1("ciao") && !notEmpty1(""))

  val empty2: String => Boolean = _ == ""
  val neg2: (String => Boolean) => String => Boolean = predicate => string => !predicate(string)
  val notEmpty2 = neg2(empty2)
  println(notEmpty2("ciao"))
  println(notEmpty2(""))
  println(notEmpty2("ciao") && !notEmpty2(""))



