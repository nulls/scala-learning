package ru.green.room.scala.spetik

import scala.collection.mutable

object Reducer {
  def main(args: Array[String]): Unit = {
    val emptyMap: mutable.LinkedHashMap[String, Int] = mutable.LinkedHashMap.empty

    def accum(result: mutable.LinkedHashMap[String, Int], line: String): mutable.LinkedHashMap[String, Int] = {
      val pair = line.split("\t")
      val word = pair(0)
      val count = pair(1).toInt
      val prevAccum = result.get(word).getOrElse(0)
      result.put(word, prevAccum + count)
      result
    }
    io.Source.stdin.getLines().foldLeft(emptyMap)(accum).foreach(r => println(r._1 + "\t" + r._2))
  }
}
