package ru.green.room.scala.spetik

object DistinctValuesV1MapperPhase2 {
  def main(args: Array[String]) {
    io.Source.stdin
      .getLines()
      .map(_.split(","))
      .map(_(1))
      .foreach(r => println(r + "\t1"))
  }
}