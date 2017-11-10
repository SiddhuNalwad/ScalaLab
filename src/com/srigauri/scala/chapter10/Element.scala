package com.srigauri.scala.chapter10

abstract class Element {
  def contents: Array[String]
  def height: Int = contents.length
  def width: Int = if (height==0) height else contents(0).length()
  
  def above(that: Element): Element = new ArrayElement(this.contents ++ that.contents)
}