package com.raquibul.quickstartall.scala.oops

class Foo(){  
	var fool = new Foo();
  def this(myFoo: Foo){
    this();
    this.fool = myFoo;  
  }
  private[this] val i = 2
  //println(this.i + fool.i) Won't compile if private[this]
}

object PrivateThisTest {
  def main(args:Array[String]){
    println("hi")
    
  }
}