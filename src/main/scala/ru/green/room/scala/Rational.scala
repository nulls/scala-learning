package ru.green.room.scala

class Rational(n: Int, d: Int) {
  require(d != 0)

  private val g = gcd(n.abs, d.abs)
  val number: Int = n / g
  val denom: Int = d / g

  def this(n: Int) = this(n, 1)

  def + (that: Rational): Rational =
    new Rational(
      number * that.denom + that.number * denom,
      denom * that.denom
    )

  def + (that: Int): Rational =
    new Rational(number + that * denom, denom)

  def - (that: Rational): Rational =
    new Rational(
      number * that.denom - that.number * denom,
      denom * that.denom
    )

  def - (that: Int): Rational =
    new Rational(number - that * denom, denom)

  def * (that: Rational): Rational =
    new Rational(
      number * that.number,
      denom * that.denom
    )

  def * (that: Int): Rational =
    new Rational(number * that, denom)

  def / (that: Rational): Rational =
    new Rational(
      number * that.denom,
      denom * that.number
    )

  def / (that: Int): Rational =
    new Rational(number, denom * that)

  def add(that: Rational): Rational = this + that

  override def toString: String = number + "/" + denom

  private def gcd(a: Int, b: Int): Int =
    if (b == 0) a else gcd(b, a % b)
}
