package com.raquibul.quickstartall.scala.tuple

object TuplesTest {

  def main(args: Array[String]) {
    //testBasicTuples
    
    //testMoreTupleFunction
    
    var myTuple = myFunctionReturnsTuple("Raquibul")
    println(myTuple._1)
    
    
  }

  def testBasicTuples{
    var tuple = (1, 5, 8, 6, 4) // Tuple of integer values  
    var tuple2 = ("Apple", "Banana", "Gavava") // Tuple of string values  
    var tuple3 = (2.5, 8.4, 10.50) // Tuple of float values  
    var tuple4 = (1, 2.5, "India") // Tuple of mix type values  
    println(tuple)
    println(tuple2)
    println(tuple3)
    println(tuple4)
  }
  
  def testMoreTupleFunction {
    var tupleValues = (1, 2.5, "India")
    println("iterating values: ")
    tupleValues.productIterator.foreach(println) // Iterating tuple values using productIterator  
    println("Accessing values: ")
    println(tupleValues._1) // Fetching first value  
    println(tupleValues._2) // Fetching second value  
  }
  
  def myFunctionReturnsTuple(name:String) = { //If you don't provide = sign , by default the return type will be unit
   (name, 1)
  }
}