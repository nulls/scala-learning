package ru.green.room.scala

object FallWinterSpringSummer extends App {
  for (season <- args)
    println(season + ": " + ChecksumAccumulator.calculate(season))
}
