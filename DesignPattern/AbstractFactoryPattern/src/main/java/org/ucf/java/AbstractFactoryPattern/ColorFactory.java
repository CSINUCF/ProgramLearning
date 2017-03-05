package org.ucf.java.AbstractFactoryPattern;

import org.ucf.java.FactoryPattern.*;

public class ColorFactory extends AbstractFactory {

	@Override
	Color getColor(String color) {
		// TODO Auto-generated method stub
		Color reg = null;
		if(color != null){
			switch(color.toLowerCase()){
				case "red": {
					reg = new Red();
				}break;
				case "green": {
					reg = new Green();
				}break;
				case "blue": {
					reg = new Blue();
				}break;
				default:{
					System.out.println("There are some error about color type:"+color);
				}
			}
		}
		return reg;
	}

	@Override
	Shape getShape(String shape) {
		return null;
	}
}
