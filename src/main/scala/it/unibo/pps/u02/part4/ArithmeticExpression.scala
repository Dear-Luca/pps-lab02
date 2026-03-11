package it.unibo.pps.u02.part4

import it.unibo.pps.u02.part4.Expr.{Add, Literal, Multiply}


enum Expr:
    case Literal(constant: Int)
    case Add(expr1: Expr, expr2: Expr)
    case Multiply(expr1: Expr, expr2: Expr)

object Operations:
  def evaluate(expr: Expr): Int = expr match
    case Literal(n) => n
    case Add(e1, e2) => evaluate(e1) + evaluate(e2)
    case Multiply(e1, e2) => evaluate(e1) * evaluate(e2)

  def show(expr: Expr): String = expr match
    case Literal(n) => s"$n"
    case Add(e1, e2) => "(" + show(e1) + " + " + show(e2) + ")"
    case Multiply(e1, e2) => "(" + show(e1) + " * " + show(e2) + ")"



