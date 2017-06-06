package com.raquibul.quickstartall.scala.collection

object MapTest {
  def main(args: Array[String]) {
    var map = Map("A" -> "Apple", "B" -> "Ball") // Creating map  
    println(map("A")) // Accessing value by using key  
    var newMap = map + ("C" -> "Cat") // Adding a new element to map  
    println(newMap)
    var removeElement = newMap - ("B") // Removing an element from map  
    println(removeElement)
    
    map.foreach {
      case (keyanyIdentifier, value) => println (keyanyIdentifier
          + " -> " + value)  
    }
  }
}