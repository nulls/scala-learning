package ru.green.room.scala.spetik

object DistinctValuesV1Mapper {
  def main(args: Array[String]) {
    io.Source.stdin.getLines().foreach(line => {
      val lineSplitted = line.split("\t")
      val group = lineSplitted(0)
      val values = lineSplitted(1)
      values.split(",").foreach(value => {
        println(group + "," + value + "\t1")
      })
    })
  }
}