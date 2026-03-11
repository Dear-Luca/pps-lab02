package it.unibo.pps.u02.part3

@main
def es8(): Unit =
  println(reverseNumber(12345))

def reverseNumber(n: Int): Int =
  @annotation.tailrec
  def f(num: Int, acc: Int): Int = num match
    case 0 => acc
    case _ => f(num / 10, acc * 10 + num % 10)

  f(n, 0)