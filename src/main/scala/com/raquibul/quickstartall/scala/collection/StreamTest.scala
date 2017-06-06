package com.raquibul.quickstartall.scala.collection

object StreamTest {
  def main(args: Array[String]) {
    var stream = 100 #:: 200 #:: 85 #:: Stream.empty
    println(stream)
    var stream2 = (1 to 10).toStream
    println(stream2)
    var firstElement = stream2.head
    println(firstElement)
    println(stream2.take(10))
    println(stream.map { _ * 2 })
  }
}