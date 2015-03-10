

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class LinearFunctionTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class LinearFunctionTest
{    
    /**
     * Default constructor for test class LinearFunctionTest
     */
    public LinearFunctionTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void testGetSlope()
    {
        LinearFunction linearFu1 = new LinearFunction(5, 10);
        assertEquals(5, linearFu1.getSlope(), 0.1);
    }

    @Test
    public void testGetYIntercept()
    {
        LinearFunction linearFu1 = new LinearFunction(2, 3);
        assertEquals(3, linearFu1.getYintercept(), 0.1);
    }

    @Test
    public void testGetRoot1()
    {
        LinearFunction linearFu1 = new LinearFunction(-5, 5);
        assertEquals(1, linearFu1.getRoot(), 0.1);
    }

    @Test
    public void testGetRoot2()
    {
        LinearFunction linearFu1 = new LinearFunction(5, 2);
        assertEquals(-0.4, linearFu1.getRoot(), 0.1);
    }

    @Test
    public void testYValue()
    {
        LinearFunction linearFu1 = new LinearFunction(-2, 4);
        assertEquals(12, linearFu1.getYvalue(-4), 0.1);
    }

    @Test
    public void testXValue1()
    {
        LinearFunction linearFu1 = new LinearFunction(4, -3);
        assertEquals(0, linearFu1.getXvalue(-3), 0.1);
    }

    @Test
    public void getXValue2()
    {
        LinearFunction linearFu1 = new LinearFunction(-.5, .25);
        assertEquals(-399.5, linearFu1.getXvalue(200), 0.1);
    }
}







