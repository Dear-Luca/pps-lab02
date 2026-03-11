package task4

import it.unibo.pps.u02.part4.Expr.{Add, Literal, Multiply}
import it.unibo.pps.u02.part4.{Expr, Operations}
import org.junit.Assert.*
import org.junit.*

class ArithmeticExpressionTest:
  @Test
  def testLiteralCorrectness(): Unit =
    val n = 5
    val res = Operations.evaluate(Literal(n))
    assertEquals(n, res, 0)

  @Test
  def testSumCorrectness(): Unit =
    val n1 = 5
    val n2 = 4
    val res = Operations.evaluate(Add(Literal(n1), Literal(n2)))
    assertEquals(n1 + n2, res, 0)

  @Test
  def testMulCorrectness(): Unit =
    val n1 = 5
    val n2 = 4
    val res = Operations.evaluate(Multiply(Literal(n1), Literal(n2)))
    assertEquals(n1 * n2, res, 0)

  @Test
  def testFullExpressionCorrectness(): Unit =
    val n1 = 7
    val n2 = 3
    val n3 = 6
    val n4 = 5

    val res = Operations.evaluate(Add(Add(Literal(n1), Literal(n2)), Multiply(Literal(n3), Literal(n4))))
    assertEquals((n1 + n2) + (n3 * n4) , res, 0.0)
