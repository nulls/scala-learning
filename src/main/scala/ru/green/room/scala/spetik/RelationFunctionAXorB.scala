package ru.green.room.scala.spetik

import scala.collection.mutable

object RelationFunctionAXorB {
  def main(args: Array[String]) {
    val map = mutable.LinkedHashMap[String, mutable.Set[String]]()
    io.Source.stdin
      .getLines()
      .map(_.split("\t"))
      .foreach(line => {
        val prevValue = map.getOrElse(line(0), mutable.Set[String]())
        prevValue.add(line(1))
        map.put(line(0), prevValue)
      })

    map.filter(_._2.size == 1).foreach(r => println(r._1))
  }
}
