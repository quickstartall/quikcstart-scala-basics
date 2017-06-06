package com.raquibul.quickstartall.scala.oops

object TestAccessModifier {
  def main(args:Array[String]) : Unit = {
    println("Hi There ");
    ObjectAccessModifier.sayHello();
    //ObjectAccessModifier.sayHelloPrivate(); compilation error becausee this is defined as private method
    //ObjectAccessModifier.sayHelloProtected(); protected can not be accessed.
  }
}