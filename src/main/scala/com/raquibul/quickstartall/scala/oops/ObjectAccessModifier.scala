package com.raquibul.quickstartall.scala.oops

object ObjectAccessModifier {
  def sayHello() {
    println("Hello from sayHello");
  }
  
  private def sayHelloPrivate() {
    println("Hello from sayHelloPrivate");
  }
  
  protected def sayHelloProtected() {
    println("Hello from sayHelloProtected");
  }
  
  def search (a:Any):Unit = a match {  
        case 1  => println("One")  
        case "Two" => println("Two")  
        case "Hello" => println("Hello")  
        case _ => println("No")  
              
        }  
}