
/**
 * @author Kevin Estrada, Trevor Bych
 * @version 
 */
public class LinearFunction implements LinearFunctionMethods
{
    double m;
    double b;
    double root;
    double x;
    double y;
    public LinearFunction (double m, double b)
    {   
        this.m = m;
        this.b = b;
                }
    
    public double getSlope()
    {
        return m;
    }
    
    public double getYintercept()
    {
        return b;
    }
    
    public double getRoot()
    {
        root = (-b)/m;
        return root;
    }
    
    public double getYvalue(double x)
    {
        this.x = x;
        y = m*x +b;
        return y;
    }
    
    public double getXvalue(double y)
    {
        this.y = y;
        x = (y-b)/m;
        return x;
    }    
}
