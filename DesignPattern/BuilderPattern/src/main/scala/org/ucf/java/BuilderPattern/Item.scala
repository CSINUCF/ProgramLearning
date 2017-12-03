package org.ucf.java.BuilderPattern

trait Item { item =>
  def name():String
  def packing():Packing
  def price():Float

  override def toString: String =
    "Item: "+item.name() +
    ", Packing: " + item.packing().pack() +
    ", Price: " + item.price()
}
abstract class Burger extends Item{
  override def packing(): Packing = new Wrapper
}

class VegBurger extends Burger {
  override def price(): Float = 25.0f

  override def name(): String = "Veg Burger"
}

class ChickenBurger extends Burger {
  override def price(): Float = 50.5f

  override def name(): String = "Chicken Burger"
}

abstract class ColdDrink extends Item{
  override def packing(): Packing = new Bottle
}

class Coke extends ColdDrink{
  override def price(): Float = 30.3f

  override def name(): String = "Coke"
}
class Pepsi extends ColdDrink {
  override def price(): Float = 35.0f

  override def name(): String = "Pepsi"
}
