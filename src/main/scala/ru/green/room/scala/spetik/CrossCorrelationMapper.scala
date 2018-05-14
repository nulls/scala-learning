package ru.green.room.scala.spetik

object CrossCorrelationMapper {
  def main(args: Array[String]) {
    def toPairs(values: Array[String]): Array[(String, String)] = {
      for (left <- values; right <- values; if (!left.equals(right)))
        yield (left, right)
    }

    val values = io.Source.stdin
      .getLines()
      .map(_.split(" "))
      .flatMap(toPairs(_))
      .foreach(r => println(r._1 + "," + r._2 + "\t1"))
  }
}