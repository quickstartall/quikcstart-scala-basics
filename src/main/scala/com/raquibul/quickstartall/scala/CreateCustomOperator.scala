package com.raquibul.quickstartall.scala
//This will restrict the string to 5 characters long
object CreateCustomOperator {
  var organization: String = "defaultOrg"
  var name: String = "defaultName";

  implicit class CustomOperator(var attribute: String) { //by default val

    def :=(that: String) = {
      if (attribute == "defaultOrg") {
        organization = that.substring(0, 5)
      } else if (attribute == "defaultName") {
        name = that.substring(0, 5)
      } else {
        println("none=" + attribute)
      }
    };

  }

  def main(args: Array[String]) {
    //var seq: Seq[Int] = Seq(52, 85, 1, 8, 3, 2, 7)
    //var seq2 = seq ++ Seq(9999, 88888, 77777);

    //var seq3 = Seq(organization := "com.example", name := "Raquibul"); //you can call this way as well
    
    organization := "com.example"
    name := "Raquibul"
    
    //organization and name after calling the operator
    println(organization);
    println(name);

  }

}