package com.raquibul.quickstartall.scala.exception

class ExceptionExample {
  def divide(a: Int, b: Int) = {
    try {
      a / b
    } catch {
      case e: ArithmeticException => println(e)
    }
    println("Rest of the code is executing...")
  }
}

class ExceptionExampleMultipleSxception {
  def divide(a: Int, b: Int) = {
    try {
      a / b
      var arr = Array(1, 2)
      arr(10)
    } catch {
      case e: ArithmeticException => println(e)
      case ex: Throwable  => println("found a unknown exception" + ex)
    }
    println("Rest of the code is executing...")
  }
}


class ExceptionExampleWithFinally{  
    def divide(a:Int, b:Int) = {  
        try{  
            a/b  
            var arr = Array(1,2)  
            arr(10)  
        }catch{  
            case e: ArithmeticException => println(e)  
            case ex: Exception =>println(ex)  
            case th: Throwable=>println("found a unknown exception"+th)  
        }  
        finally{  
            println("Finaly block always executes")  
        }  
        println("Rest of the code is executing...")  
    }  
}  

object ExceptionTest {
  def main(args: Array[String]) {
    var e = new ExceptionExample()
    e.divide(100, 0)

    println("=========================================================")
    new ExceptionExampleMultipleSxception().divide(200, 0)
    println("=========================================================")
    new ExceptionExampleWithFinally().divide(20,0);
  }
}