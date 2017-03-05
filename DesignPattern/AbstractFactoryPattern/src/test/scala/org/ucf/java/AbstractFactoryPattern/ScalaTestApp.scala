package org.ucf.java.AbstractFactoryPattern;
/**
  * @author
  */
import org.junit.Test
import org.junit.Assert._
import org.ucf.java.FactoryPattern.ShapeTrait
class ScalaTestAPP {
  @Test def testAdd() {
    println("Hello World From Scala");
    (FactoryProducer_s("color","red").asInstanceOf[ColorTrait]).fill()
    (FactoryProducer_s("shape","circle").asInstanceOf[ShapeTrait]).draw()
    
    assertTrue(true);
  }
}