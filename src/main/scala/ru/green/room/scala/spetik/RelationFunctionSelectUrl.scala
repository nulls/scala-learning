package ru.green.room.scala.spetik

object RelationFunctionSelectUrl {
  def main(args: Array[String]) {
    io.Source.stdin
      .getLines()
      .map(_.split("\t"))
      .map(_(2))
      .foreach(println)
  }
}
