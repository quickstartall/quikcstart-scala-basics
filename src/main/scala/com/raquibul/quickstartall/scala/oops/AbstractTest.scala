package com.raquibul.quickstartall.scala.oops

//abstract class AbstractBike(a:Int=0){       // Creating constructor with default value
abstract class AbstractBike(a:Int=0){             // Creating constructor  
    var b:Int = 20;                      // Creating variables  
    var c:Int = 25;  
    
    //var x:Int; // abstract varaible
    
    def run();                          // Abstract method  
    
    def performance(){                  // Non-abstract method  
        println("Performance awesome")  
    }  
}  
  
//class Hero(a:Int) extends AbstractBike(a=50){ //Calle constrcutor with named parameter  
class Hero(a:Int) extends AbstractBike(a){  
    c = 30  
    //x = 90;
    def run(){  
        println("Running fine...")  
        println("a = "+a)  
        println("b = "+b)  
        println("c = "+c)  
    }  
}  

object AbstractTest {
   def main(args: Array[String]){  
        var h = new Hero(10)  
        h.run()  
        h.performance()  
    } 
}