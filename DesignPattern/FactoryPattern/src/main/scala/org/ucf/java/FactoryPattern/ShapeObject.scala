package org.ucf.java.FactoryPattern

class ShapeObject(){

}


object ShapeObject {
  private class Rectangle extends ShapeTrait {
    override def draw() = println("Inside Rectangle::draw() method. from scala")
  }
  
  private class Square extends ShapeTrait {
    override def draw() = println("Inside Square::draw() method. from scala")
  }
  
  private class Circle extends ShapeTrait {
    override def draw() = println("Inside Circle::draw() method. from scala")
  } 
  def apply(shapeType:String):ShapeTrait = {  
    shapeType.toLowerCase() match {
      case "rectangle" => return new Rectangle()
      case "square" => return new Square()
      case "circle" => return new Circle()
      case _ => {
        println(s"Shape Type is error ${shapeType}\n")
        return null
      }
    } 
  }
}