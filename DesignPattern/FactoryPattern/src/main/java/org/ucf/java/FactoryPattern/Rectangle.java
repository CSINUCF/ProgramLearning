/**
 * 
 */
package org.ucf.java.FactoryPattern;

/**
 * @author Bing
 *
 */
public class Rectangle implements Shape {

	/* (non-Javadoc)
	 * @see org.ucf.java.FactoryPattern.Shape#draw()
	 */
	@Override
	public void draw() {
		System.out.println("Inside Rectangle::draw() method. from java");
	}

}
