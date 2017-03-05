package org.ucf.java.AbstractFactoryPattern;

/**
 * @author 
 */
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.ucf.java.FactoryPattern.*;
public class JavaTestApp extends TestCase{
	  /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public JavaTestApp( String testName )
    {
        super( testName );
    }
    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( JavaTestApp.class );
    }
    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
    	System.out.println("Hello World From Java");
    	AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
    	if(shapeFactory != null){
    		Shape shapeCircle = shapeFactory.getShape("CIRCLE");
    		shapeCircle.draw();
    	}else{
    		System.out.println("shapeFactory is null");
    	}
    	
    	AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");
    	if(colorFactory != null){
    		colorFactory.getColor("RED").fill();
    	}else{
    		System.out.println("colorFactory is null");
    	}
        assertTrue( true );
    }
}