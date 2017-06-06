package com.raquibul.quickstartall.scala.collection

import scala.collection.immutable.SortedSet
import scala.collection.immutable.ListSet

object SetTest {
  def main(args: Array[String]) {
    /*val myEmpltySet: Set[String] = Set();
    var games = Set("Cricket", "Football", "Hocky", "Golf")
    val stadium = Set("Lords", "Santiago Bernabéu", "Sydney", "Muirfield");
    println(games.head) // Returns first element present in the set  
    println(games.tail) // Returns all elements except first element.  
    println(games.isEmpty) // Returns either true or false  
    println(myEmpltySet.isEmpty)

    val mergedSet = games ++ stadium;
    println(mergedSet)

    println("Golf exists in the set : " + games.contains("Golf"))
    println("Racing exists in the set : " + games.contains("Racing"))

    games += "Racing" // Adding new element  
    println(games)
    games += "Cricket" // Adding new element, it does not allow duplicacy.  
    println(games)
    games -= "Golf" // Removing element  
    println(games)*/

    //Print elements of the set
    //printSetElements(games);

    //Test Intersection and Union
    //testIntersectinoUnion()

    //Test sorted set
    //testSortedSet();
    
    //Test List Set
    testListSet

  }

  def printSetElements(input: Set[String]) {
    //Example for
    println("Printing set elements using for...");
    for (game <- input) {
      println(game);
    }

    //Example foreach
    println("Printing set elements using forEach...");
    input.foreach((element: String) => println(element));
  }

  def testIntersectinoUnion() {
    var games = Set("Cricket", "Football", "Hocky", "Golf", "C")
    var alphabet = Set("A", "B", "C", "D", "E", "Golf")
    var setIntersection = games.intersect(alphabet)
    println("Intersection by using intersect method: " + setIntersection)
    println("Intersection by using & operator: " + (games & alphabet))
    var setUnion = games.union(alphabet)
    println(setUnion)
  }

  def testSortedSet() {
    var numbers: SortedSet[Int] = SortedSet(5, 8, 1, 2, 9, 6, 4, 7, 2)
    //numbers.foreach((element: Int) => println(element))

    //Sort Objects example
    var stud1 = new Student(1, "Raquibul");
    var stud2 = new Student(2, "Frank");
    var stud3 = new Student(3, "Gopaldas");
    println(stud1.studName);

    //x:Student => x.studName
    //val orderByName = Ordering.by[Student, String](_.studName)
    val orderByName = Ordering.by { stud: Student => stud.studName }

    var students = SortedSet(stud1, stud2, stud3)(orderByName);

    println("sorted set")
    students.foreach((element: Student) => println(element.studName))

    //println(students);
  }

  def testListSet {
    var listset = ListSet(4, 2, 8, 0, 6, 3, 45)

    listset.foreach((element: Int) => println(element + " "))
   
    var emptySet1: ListSet[String] = new ListSet() // Creating empty ListSet by using constructor  
    var emptySet2: ListSet[String] = ListSet.empty // Creating an empty listset  
    println("listset: " + emptySet1)
    println("listset2: " + emptySet2)
    println("After adding new elements:")
    emptySet1 += "India" // Adding new element  
    emptySet2 += "Russia" // Adding new element  
    println("listset: " + emptySet1)
    println("listset2: " + emptySet2)
  }

}