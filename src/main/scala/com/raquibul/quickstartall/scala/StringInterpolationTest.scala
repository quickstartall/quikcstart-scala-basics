package com.raquibul.quickstartall.scala

class StringExampleSMethod {
  var pi = 3.14
  def show() {
    println(s"value of pi = $pi")
  }
}

class StringExampleFMethod {
  var s1 = "Scala string example"
  var version = 2.12
  def show() {
    println(f"This is $s1%s, scala version is $version%2.2f")
  }
}

class StringExampleRaw {
  var s1 = "Scala \tstring \nexample"
  var s2 = raw"Scala \tstring \nexample"
  def show() {
    println(s1)
    println(s2)
  }
}

object StringInterpolationTest {
  def main(args: Array[String]) {
    //s method test
    var s = new StringExampleSMethod()
    s.show()
    println("============================================================");
    //F method test
    var f = new StringExampleFMethod();
    f.show();
    println("============================================================");
    //raw  test
    var rawTest = new StringExampleRaw()
    rawTest.show()
  }
}