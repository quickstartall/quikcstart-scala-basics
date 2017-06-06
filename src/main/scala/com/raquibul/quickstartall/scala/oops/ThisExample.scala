package com.raquibul.quickstartall.scala.oops

class ThisExample{  
    var id:Int = 0  
    var name: String = "default"  
    
    def this(id:Int, name:String){  
        this()  
        this.id = id  
        this.name = name  
    }  
    def show(){  
        println(id+" "+name)  
    }  
}  
  
object TestThisExample{  
    def main(args:Array[String]){  
        var t = new ThisExample(101,"Martin")  
        t.show()  
    }  
}  