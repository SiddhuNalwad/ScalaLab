package com.srigauri.scala.chapter10

object ScalaTester {
  def main(args: Array[String]): Unit = {
    val e1: Element = new ArrayElement(Array("hello","world"))
    println("width:" + e1.width)
    println("height:" + e1.height)
    println(e1.contents)
    for(line <- e1.contents)
      println(line)
    println("-----------------------------");
    
    val e2 = new LineElement("hello,world");
    println("width:" + e2.width)
    println("height:" + e2.height)
    println(e2.contents)
    for(line <- e2.contents)
      println(line)
    println("-----------------------------");
    
    val e3 = new UniformElement('x', 5, 3)
    println("width:" + e3.width)
    println("height:" + e3.height)
    println(e3.contents)
    for(line <- e3.contents)
      println(line)
    println("-----------------------------");
    val e4 = e1.above(e3)
    for(line <- e4.contents)
        println(line)
    
  }
}