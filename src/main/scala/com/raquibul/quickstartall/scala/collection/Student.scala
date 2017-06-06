package com.raquibul.quickstartall.scala.collection

class Student(id: Int, name: String) {
  var studId: Int = id;
  var studName: String = name;
  implicit def ordering[A <: Student]: Ordering[A] = Ordering.by(_.studName);
}