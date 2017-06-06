package com.raquibul.quickstartall.scala

import com.raquibul.quickstartall.scala.Animal

import com.raquibul.quickstartall.scala.AnimalCounter

class Dog extends Animal {
  def companion = Dog
  
}

object Dog extends AnimalCounter {
  var name = "Rocky Dog "
  var color = "red"
  //animals = 4;
}