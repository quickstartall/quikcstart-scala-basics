package com.raquibul.quickstartall.scala.io

import java.io.PrintWriter
import java.io.File
import scala.io.Source

object FileTest {

  def main(args: Array[String]) {
    //Create file
    createFile
    
    //now, read the file
    readFile
  }

  def readFile {
    val filename = "C:\\MyWork\\MyTestFile.txt"
    val fileSource = Source.fromFile(filename)
    for (line <- fileSource.getLines) {
      println(line)
    }
    fileSource.close()
  }

  def createFile {
    val fileObject = new File("C:\\MyWork\\MyTestFile.txt") // Creating a file  
    val printWriter = new PrintWriter(fileObject) // Passing reference of file to the printwriter  
    printWriter.write("Hello, This is scala file") // Writing to the file  
    printWriter.close() // Closing printwriter  
  }
}

