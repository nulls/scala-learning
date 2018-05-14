package ru.green.room.scala.spetik;

object RelationFunctionSelectUser10 {
  def main(args: Array[String]) {
    val user10 = "user10"
    io.Source.stdin
      .getLines()
      .map(_.split("\t"))
      .filter(line => user10.equals(line(1)))
      .foreach(r => println(r(0) + "\t" + r(1) + "\t" + r(2)))
  }
}
