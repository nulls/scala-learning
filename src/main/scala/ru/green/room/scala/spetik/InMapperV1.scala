package ru.green.room.scala.spetik;

object InMapperV1 {
  def main(args: Array[String]) {
    for (line <- io.Source.stdin.getLines()) {
       line.split(" ").groupBy(identity).mapValues(_.size).foreach(r => println("" + r._1 + "\t" + r._2))
    }
  }
}