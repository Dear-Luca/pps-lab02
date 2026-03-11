package it.unibo.pps.u02.part4

import it.unibo.pps.u02.part4.Expr.{Add, Literal, Multiply}


enum Expr:
    case Literal(constant: Double)
    case Add(expr1: Expr, expr2: Expr)
    case Multiply(expr1: Expr, expr2: Expr)

object Operations:
  def evaluate(expr: Expr): Double = expr match
    case Literal(n: Double) => n
    case Add(e1, e2) => evaluate(e1) + evaluate(e2)
    case Multiply(e1, e2) => evaluate(e1) * evaluate(e2)

  def show(expr: Expr): String = ""
