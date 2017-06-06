package com.raquibul.quickstartall.scala.oops

class Student(id:Int, name:String){  
    var age:Int = 0  
    def showDetails(){  
        println(id+" "+name+" "+age)  
    }  
   
    def this(id:Int, name:String,age:Int){  
        this(id,name)       // Calling primary constructor, and it is first line. Without it compilation fails
        this.age = age  
    }  
}  

object TestConstructor{  
    def main(args:Array[String]){  
        var s = new Student(101,"Rama",20);  
        s.showDetails()  
    }  
}