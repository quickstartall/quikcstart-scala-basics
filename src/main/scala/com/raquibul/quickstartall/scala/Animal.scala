package com.raquibul.quickstartall.scala

import com.raquibul.quickstartall.scala.AnimalCounter

import com.raquibul.quickstartall.scala.AnimalCounter

abstract class Animal {
  def companion: AnimalCounter
  companion.count();
  companion.printHi;
}