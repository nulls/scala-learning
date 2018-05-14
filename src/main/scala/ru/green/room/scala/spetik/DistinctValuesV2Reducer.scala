package ru.green.room.scala.spetik

import scala.collection.mutable

object DistinctValuesV2Reducer {
  val emptyMap: mutable.LinkedHashMap[String, Int] = mutable.LinkedHashMap.empty

  def main(args: Array[String]) {
    def accumulate(result: mutable.LinkedHashMap[String, Int], group: String): mutable.LinkedHashMap[String, Int] = {
      val prevCount = result.get(group).getOrElse(0)
      result.put(group, prevCount + 1)
      result
    }

    io.Source.stdin
      .getLines()
      .toSeq
      .distinct
      .map(_.split("\t"))
      .map(_(1))
      .foldLeft(emptyMap)(accumulate)
      .foreach(r => println(r._1 + "\t" + r._2))
  }
}