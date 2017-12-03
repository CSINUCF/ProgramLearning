package org.ucf.java.BuilderPattern

import scala.collection.mutable.ListBuffer

class Meal {
  private var items:ListBuffer[Item] = new ListBuffer[Item]()
  def addItem(item:Item) = items.+=(item)
  def getCost() = items.map(i => i.price()).reduce(_ + _)
  def showItems() = items.foreach(println _)
}
