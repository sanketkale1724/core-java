package Algebra;

public class Calculator {
	public static void main(String[] args)
	{ 
		//add
		int q=add(24,35);
		System.out.println("Addition is: "+q);
	    //subtract
		int a=subtract(45,24);
		System.out.println("Sutraction is: "+a);
		//multiplication
		int y=multiply(20,15);
		System.out.println("multiplication is: "+y);
		//Division
		float d=divide(45f,4f);
		System.out.println("Division is: "+d);
	}
	public static int add(int a,int b)       //void method cannot return value therefore use int
	{
		int c=a+b;
		return c;                      
	}
	public static int subtract(int d,int e)
	{
		int q=d-e;
		return q;
	}
    public static int multiply(int a,int b)
    {
    	int d=a*b;
    	return d;
    }
    public static float divide(float d,float e) 
    {
        float s=d/e;
    	return s;
    }
}

