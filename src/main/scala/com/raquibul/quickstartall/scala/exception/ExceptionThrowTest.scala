package com.raquibul.quickstartall.scala.exception

class ExceptionExampleThrowTest {
  def validate(age: Int) = {
    if (age < 18)
      throw new ArithmeticException("You are not eligible")
    else println("You are eligible")
  }
}

class ExceptionExampleThrows {
  @throws(classOf[NumberFormatException])
  def validate() = {
    "abc".toInt
  }
}

object ExceptionThrowTest {
  def main(args: Array[String]) {
    //var e = new ExceptionExampleThrowTest()
    //e.validate(10)

    println("=======================================================")
    try {
      new ExceptionExampleThrows().validate()
    } catch {
      case ex: NumberFormatException => println("Exception handeled here")
    }
    println("Rest of the code executing...")

    var name:String = "Raquibul";
    
  }
}

