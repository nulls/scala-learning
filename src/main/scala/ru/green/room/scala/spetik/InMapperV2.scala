package ru.green.room.scala.spetik

object InMapperV2 {
  def main(args: Array[String]) {
    io.Source.stdin.getLines().flatMap(_.split(" ")).toSeq.groupBy(identity).mapValues(_.size).foreach(r => println("" + r._1 + "\t" + r._2))
  }
}