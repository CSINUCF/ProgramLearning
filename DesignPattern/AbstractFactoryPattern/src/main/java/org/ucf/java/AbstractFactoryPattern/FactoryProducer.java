/**
 * 
 */
package org.ucf.java.AbstractFactoryPattern;

/**
 * @author Bing
 *
 */
public class FactoryProducer {
	public static AbstractFactory getFactory(String choice){
		if(choice.equalsIgnoreCase("COLOR")){
			return new ColorFactory();
		}else if(choice.equalsIgnoreCase("SHAPE")){
			return new ShapeFactory();
		}else{
			System.out.println("The choise wrong, please make sure before "+choice);
			return null;
		}
	}

}
