package ru.spbstu.telematics.java;

/**
 * Hello world!
 *
 */
class Vector {
	  public final int x;
	  public final int y;
	  public Vector( int x, int y){
	    this.x = x;
	    this.y = y;
	  }
	}


public class App 
{
	public static int VecSum(Vector a, Vector b)
	{
		return a.x*b.x+a.y*b.y;
	}
	
    public static void main( String[] args )
    {
        Vector a = new Vector(5,6);
        Vector b = new Vector(4,10);
        System.out.println(VecSum(a,b));
    }
}
