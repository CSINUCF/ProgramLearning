package org.ucf.java.FactoryPattern;
/**
  * @author
  */
import org.junit.Test
import org.junit.Assert._

class ScalaTestAPP {
  @Test def testAdd() {
    println("Hello World From Scala");
    ShapeObject("rectangle").draw()
    ShapeObject("square").draw()
    ShapeObject("Circle").draw()
    val shapeFactory = new ShapeFactory()
    val shape1 = shapeFactory.getShape("circle")
    shape1.draw()

    assertTrue(true);
  }
}