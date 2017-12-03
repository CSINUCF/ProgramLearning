package org.ucf.java.BuilderPattern

trait Packing {
  def pack():String
}

class Wrapper extends Packing{
  override def pack(): String = "Wrapper"
}

class Bottle extends Packing{
  override def pack(): String = "Bottle"
}