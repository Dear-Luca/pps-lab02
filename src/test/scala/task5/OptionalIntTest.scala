package task5

import org.junit.*
import org.junit.Assert.*
import Optionals.*
import task5.Optionals.OptionalInt.{Empty, Just}

class OptionalIntTest:
  @Test def emptyOptionalShouldBeEmpty(): Unit =
    val empty = OptionalInt.Empty()
    assertTrue(OptionalInt.isEmpty(empty))

  @Test def nonEmptyOptionalShouldNotBeEmpty(): Unit =
    val nonEmpty = OptionalInt.Just(0)
    assertFalse(OptionalInt.isEmpty(nonEmpty))

  @Test def orElseShouldReturnDefaultWhenEmpty(): Unit =
    val nonEmpty = OptionalInt.Just(0)
    assertEquals(0, OptionalInt.orElse(nonEmpty, 1))

  @Test def orElseShouldReturnValueWhenNonEmpty(): Unit =
    val empty = OptionalInt.Empty()
    assertEquals(1, OptionalInt.orElse(empty, 1))

  @Test def testMapIntWithNonEmptyOptional(): Unit =
    val operation: Int => Int = _ + 1
    val n = 2
    val opt: OptionalInt = Just(n)
    val res = OptionalInt.mapInt(opt)(operation)
    assertEquals(Just(n + 1), res)

  @Test def testMapIntWithEmptyOptional(): Unit =
    val operation: Int => Int = _ + 1
    val opt: OptionalInt = Empty()
    val res = OptionalInt.mapInt(opt)(operation)
    assertEquals(Empty(), res)