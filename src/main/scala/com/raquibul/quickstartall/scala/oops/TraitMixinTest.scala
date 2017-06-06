package com.raquibul.quickstartall.scala.oops

trait Print{  
    def print()  
}  

trait PrintMessage{  
    def printMessage()  
}

trait SendEmail{  
    def sendEmail()  
}

abstract class PrintA4{  
    def printA4()  
}  
  
class AConcrete extends PrintA4 with Print with PrintMessage {            // First one is abstract class second one is trait  
    def print(){                                        // Trait print  
        println("print sheet")  
    }  
    def printA4(){                                      // Abstract class printA4  
        println("Print AConcrete Sheet")  
    }  
    
    def printMessage(){
      println("printMessage from AConcrete");
    }
    
    def sendEmail() {
      println("send email from AConcrete");
    }
}  

object TraitMixinTest {
  def main(args:Array[String]){  
        var a = new AConcrete()  
        a.print()  
        a.printA4();  
        
        
        var another = new AConcrete() with SendEmail //  extend trait during object creation. make sure that you have concrete function Implementing class   
        another.sendEmail();
    } 
}