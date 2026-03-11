package it.unibo.pps.u02.part3

@main
def es7(): Unit =
  println(power(5, 3))
  println(power(2, 3))

  println(powerTailed(2, 4))
  println(powerTailed(5, 2))


def power(base: Double, exponent: Int): Double = exponent match
  case 0 => 1
  case _ => base * power(base, exponent - 1)

def powerTailed(base: Double, exponent: Int): Double =
  @annotation.tailrec
  def _power(n: Int, acc: Double): Double = n match
    case 0 => acc
    case _ => _power(n - 1, acc * base)
  _power(exponent, 1)




