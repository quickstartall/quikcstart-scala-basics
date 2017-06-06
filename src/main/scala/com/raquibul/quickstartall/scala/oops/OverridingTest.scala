package com.raquibul.quickstartall.scala.oops

class Vehicle{  
  //var speed:Int = 60
    val speed:Int = 60
    def run(){  
        println("vehicle is running")  
    }
    
    final def runFinal(){  
        println("vehicle is running")  
    }
}  
  
class Bike extends Vehicle{  
    //override var speed:Int = 100  won't work
    override val speed:Int = 100;
    
    override def run(){  
        println("Bike is running")  
    }  
    
    /*override def runFinal(){  
        println("vehicle is running")  
    }*/
}  
  
object OverridingTest {
  def main(args:Array[String]){  
        var b = new Bike()  
        b.run()  
    }  
}