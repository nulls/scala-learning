package ru.green.room.scala.spetik

object Mapper {
  def main(args: Array[String]): Unit = {
    io.Source.stdin.getLines().flatMap(_.split(" ")).foreach(r => println(r + "\t1"))
  }
}
