package ru.green.room.scala.spetik

import scala.collection.mutable

object CrossCorrelationMapperStripe {
  def main(args: Array[String]) {
    def printStripes(values: Array[String]): Unit = {
      for (value <- values) {
        val map = mutable.LinkedHashMap[String, Int]()
        for (anotherValue <- values) {
          if (!value.equals(anotherValue)) {
            map.put(anotherValue, map.getOrElse(anotherValue, 0) + 1)
          }
        }
        print("" + value + "\t")
        val iterator = map.iterator
        while (iterator.hasNext) {
          val anotherValueAndCount = iterator.next
          print(anotherValueAndCount._1 + ":" + anotherValueAndCount._2)
          if (iterator.hasNext) {
            print(",")
          }
        }
        println
      }
    }

    val values = io.Source.stdin
      .getLines()
      .map(_.split(" "))
      .foreach(printStripes)
  }
}