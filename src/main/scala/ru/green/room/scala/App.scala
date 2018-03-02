package ru.green.room.scala

object App {

  def main(args : Array[String]) {
    val x = new Rational(4, 5)
    val y = new Rational(16, 5)
    println(s"${x} + ${y} = ${x add y}" )
    println(s"${x} + ${y} = ${x + y}" )
    println(s"${x} * ${y} = ${x * y}" )

    val res0 = new Rational(66, 42)
    println(s"${res0}")

    val x1 = new Rational(2, 3)
    println(x1)
    println(x1 * x1)
    println(x1 * 2)

    implicit def intToRational(x: Int) = new Rational(x)

    println(2 * x1)
  }

}
