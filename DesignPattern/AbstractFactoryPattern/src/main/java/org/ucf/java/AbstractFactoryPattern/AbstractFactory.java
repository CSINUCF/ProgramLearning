/**
 * 
 */
package org.ucf.java.AbstractFactoryPattern;

import org.ucf.java.FactoryPattern.*;
/**
 * @author Bing
 *
 */
public abstract class AbstractFactory {
	abstract Color getColor(String color);
	abstract Shape getShape(String shape);
}
