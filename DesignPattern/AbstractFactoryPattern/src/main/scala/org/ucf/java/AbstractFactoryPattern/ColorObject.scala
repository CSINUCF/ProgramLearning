package org.ucf.java.AbstractFactoryPattern
class ColorObject(){
  
}
object ColorObject {
  private class Red() extends ColorTrait{
    override def fill() = {
      println("Inside Red::fill() method from Scala")
    }
  }
  private class Blue() extends ColorTrait{
    override def fill() = {
      println("Inside Blue::fill() method from Scala")
    }
  }
  private class Green() extends ColorTrait{
    override def fill() = {
      println("Inside Green::fill() method from Scala")
    }
  }
  def apply(color:String):ColorTrait = {
    color.toLowerCase() match {
      case "red" => new Red()
      case "blue" => new Blue()
      case "green" => new Green()
      case _ => {
        println("the color is wrong "+color)
        null
      }
    }
  }
  
}