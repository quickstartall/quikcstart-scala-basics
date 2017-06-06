package com.raquibul.quickstartall.scala.oops

class Manager extends Employee {
  println("Id=" + this.empId); //inherited from super class Employee
  println("name=" + name); //inherited from super class Employee
}

object TestInheritence{  
    def main(args:Array[String]) {  
        new Manager()  
    }  
}  