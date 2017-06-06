package com.raquibul.quickstartall.scala.oops

trait Printable { //train can be without any abstract method as well  
    def print()         // Abstract method
    def show(){         // Non-abstract method  
        println("This is show method")  
    }  
    
    val id:Int; //abstract variable
}  
  
class A6 extends Printable {  
    val id = 0;  //This is not possible with Abstract class
    def print(){  
        println("This is print method")  
        println();
    }  
}  
  

object TraitTest {
   def main(args:Array[String]){  
        var a = new A6()  
        a.print()  
        a.show()  
    }  
}