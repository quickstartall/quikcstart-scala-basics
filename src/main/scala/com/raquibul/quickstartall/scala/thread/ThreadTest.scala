package com.raquibul.quickstartall.scala.thread

class ThreadExample extends Thread {
  override def run() {
    println("Thread is running using Thread class...");
  }
}

class ThreadExampleRunnable extends Runnable {
  override def run() {
    println("Thread is running using Runnable...")
  }
}

object ThreadTest {
  def main(args: Array[String]) {
    var t = new ThreadExample()
    t.start()

    var myRunnable = new ThreadExampleRunnable()
    var thread = new Thread(myRunnable)
    thread.start()

  }
}