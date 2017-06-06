package com.raquibul.quickstartall.scala.collection

object SequenceTest {
  implicit class Custom(var org: String) { //by default val
    //var org:String = "default"
    def :=(that: String) = this.org = that;
  }
  
  def main(args: Array[String]) {
    var seq: Seq[Int] = Seq(52, 85, 1, 8, 3, 2, 7)
    var seq2 = seq ++ Seq(9999, 88888, 77777);
    var organization: String = ""
    var name: String = "";

    var seq3 = Seq(organization := "com.example");

    println(seq2);

    //Sort Objects example
    var stud1 = new Student(1, "Raquibul");
    var stud2 = new Student(2, "Frank");
    var stud3 = new Student(3, "Gopaldas");
    var studSeq: Seq[Student] = Seq(stud1, stud2, stud3)

    //seq.foreach((element: Int) => print(element + " "))
    //studSeq.reverse.foreach((element: Student) => println(element.studName))
    //println("contains gopalbabu: " + studSeq.contains(stud3))

    /*println("\nis Empty: " + seq.isEmpty)
    println("Ends with (2,7): " + seq.endsWith(Seq(2,7)))
    println("contains 8: " + seq.contains(8))
    println("last index of 3 : " + seq.lastIndexOf(3))
    println("Reverse order of sequence: " + seq.reverse)*/
  }

}