package com.brahim.tuto

import scala.collection.mutable.Map
object ChecksumAccumulator {

  private val cache = Map[String, Int]()
  def calculate(s: String): Int =
    if (cache.contains(s))
      cache(s)
    else {
      val acc = new ChecksumAccumulator
      acc.updateRecordByName('favoriteAlbum, "OK Computer")

      for (c <- s)
        acc.add(c.toByte)
      val cs = acc.checksum()
      cache += (s -> cs)
      cs
    }


}

class ChecksumAccumulator {
  private var sum = 0
  def add(b: Byte) { sum += b }
  def checksum(): Int = ~(sum & 0xFF) + 1



  def updateRecordByName(r: Symbol, value: Any) {
    // code goes here
  }
}
