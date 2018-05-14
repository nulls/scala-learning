package ru.green.room.scala.spetik

import scala.collection.mutable

object InReducer {
  def main(args: Array[String]) {
    val nullAccum: (Int, Int) = (0, 0)
    val emptyMap: mutable.LinkedHashMap[String, (Int, Int)] = mutable.LinkedHashMap.empty

    def accum(result: mutable.LinkedHashMap[String, (Int, Int)], line: String): mutable.LinkedHashMap[String, (Int, Int)] = {
      val pair = line.split("\t")
      val word = pair(0)
      val coutns = pair(1).split(";")
      val count = coutns(0).toInt
      val number = coutns(1).toInt
      val prevAccum = result.get(word).getOrElse(nullAccum)
      result.put(word, (prevAccum._1 + count, prevAccum._2 + number))
      result
    }
    io.Source.stdin.getLines().foldLeft(emptyMap)(accum).foreach(r => println(r._1 + "\t" + r._2._1 + ";" + r._2._2))
  }
}
