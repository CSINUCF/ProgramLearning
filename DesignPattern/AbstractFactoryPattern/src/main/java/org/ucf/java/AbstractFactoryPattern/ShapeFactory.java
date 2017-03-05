package org.ucf.java.AbstractFactoryPattern;

import org.ucf.java.FactoryPattern.Circle;
import org.ucf.java.FactoryPattern.Rectangle;
import org.ucf.java.FactoryPattern.Shape;
import org.ucf.java.FactoryPattern.Square;

public class ShapeFactory extends AbstractFactory {

	@Override
	Color getColor(String color) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	Shape getShape(String shape) {
		// TODO Auto-generated method stub
		Shape reg = null;
		if(shape == null){
			return reg;
		}
		switch(shape.toLowerCase()){
			case "circle":{
				reg = new Circle();
			}break;
			case "rectangle":{
				reg = new Rectangle();
			}break;
			case "square": {
				reg = new Square();
			}break;
			default:{
				System.out.println("The shape is wrong "+shape);
			}
		}
		return reg;
	}

}
