package Algebra;

public class Binomial_equation {
	
		public static void main(String[] args)
		{
			//(a+b)^1
			int c=equation1(4,5);
		    System.out.println("1)a=4,b=5 \n(a+b)^1 = "+c);                        //method 1
			
			//(a+b)^2
			int d=equation2(9,8);
			System.out.println("\n2)a=9,b=8 \n(a+b)^2 = "+d);                       //method 2
			
			//(a+b)^3
			System.out.println("\n3)a=6,b=11 \n(a+b)^3 = "+equation3(6,11));        //method 3
			
			//(a+b)^4
			int f=equation4(12,7);
			System.out.println("\n4)a=12,b=7 \n(a+b)^4 = "+f);
			
			//(a+b)^5
			int g=equation5(6,8);
			System.out.println("\n5)a=6,b=8 \n(a+b)^5 = "+g);
		}
		public static int equation1(int a,int b)
		{
			return a+b;                                     //function return value of a & b
		}                                                   //function=reusable function
		public static int equation2(int a,int b)
		{
			int c=(a*a)+(2*a*b)+(b*b);
			return c;
		}
		public static int equation3(int a,int b)
		{
			int c=(a*a*a)+(3*a*a*b)+(3*a*b*b)+(b*b*b);
			return c;
		}
		public static int equation4(int a,int b)
		{
		return (a*a*a*a)+(4*a*a*a*b)+(6*a*a*b*b)+(4*a*b*b*b)+(b*b*b*b);
		}
		public static int equation5(int a,int b)
		{
			int c=(a*a*a*a*a)+(5*(a*a*a*a)*b)+(10*(a*a*a)*(b*b))+(10*(a*a)*(b*b*b))+
					(5*a*(b*b*b*b))+b*b*b*b*b;
			return c;
		}

	}

