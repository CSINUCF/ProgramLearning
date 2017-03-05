package org.ucf.java.AbstractFactoryPattern

import org.ucf.java.FactoryPattern.ShapeObject
object FactoryProducer_s {
  def apply(choice:String, choose:String):Any = {
    choice.toLowerCase() match {
      case "shape" => ShapeObject(choose)
      case "color" => ColorObject(choose)
      case _ => {
        println("The choice is wrong"+choice)
        null
      }
    }
  }
}