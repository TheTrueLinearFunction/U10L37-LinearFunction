
/**
 * LinearFunction project codebase for Lesson 37: Interfaces
 * Any class that implements this interface MUST implement the methods
 * listed in the interface below
 * 
 * @author Roger Jaffe 
 * @version 2014-11-04
 */
public interface LinearFunctionMethods
{
    
    /**
     * Gets the slope of the linear function
     * @returns The slope of the linear equation
     */
    public double getSlope();

    /**
     * Gets the y-intercept of the linear function
     * @returns The y-intercept of the linear equation
     */
    public double getYintercept();

    /**
     * Gets the root of the linear equation.  The root is the 
     * same as the "zero" or the x-coordinate where the line 
     * crosses the x-axis.
     * @returns The root of the linear equation
     */
    public double getRoot();

    /**
     * Given an x-value of a function, compute the y-value
     * @param x Supplied x-value
     * @returns The function's y-value for the supplied x-value
     */
    public double getYvalue(double x);

    /**
     * Given a y-value of a function, compute the x-value
     * @param y Supplied y-value
     * @returns The function's x-value for the supplied y-value
     */
    public double getXvalue(double y);
}

