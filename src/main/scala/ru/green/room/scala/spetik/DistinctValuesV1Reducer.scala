package ru.green.room.scala.spetik

object DistinctValuesV1Reducer {
  def main(args: Array[String]) {
    io.Source.stdin.getLines().map(_.split("\t")).map(_(0)).toSeq.distinct.foreach(println)
  }
}