package it.unibo.pps.u02.task2

@main
def es3(): Unit =
  positive()
  neg()


def positive(): Unit =
  def positiveMethod(x: Int): String = x match
    case n if n >= 0 => "positive"
    case _ => "negative"

  val positiveVal: Int => String = _ match
    case n if n >= 0 => "positive"
    case _ => "negative"

  println(positiveMethod(-9))
  println(positiveVal(9))

def neg(): Unit =
  def emptyMethod(string: String): Boolean = string == ""
  println(emptyMethod("ciao"))

  def negMethod(predicate: String => Boolean): String => Boolean = string => !predicate(string)

  val notEmpty = negMethod(emptyMethod)
  println(notEmpty("ciao"))
  println(notEmpty(""))
  println(notEmpty("ciao") && !notEmpty(""))

  val emptyVal: String => Boolean = _ == ""
  val negVal: (String => Boolean) => String => Boolean = predicate => string => !predicate(string)
  val notEmpty2 = negVal(emptyVal)
  println(notEmpty2("ciao"))
  println(notEmpty2(""))
  println(notEmpty2("ciao") && !notEmpty2(""))



