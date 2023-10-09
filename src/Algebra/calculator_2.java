package Algebra;

public class calculator_2 {
	
		public static void main(String[] args)
		{
			Addition(10,20);
			Subtraction(30,20);
			Multiplication(12,10);
			Division(45,5);
		}
		public static void Addition(int a,int b)
		{
			int c=a+b;
			System.out.println("Addition of two numbers : "+c);
		}
		public static void Subtraction(int a,int b)
		{
			int c=a-b;
			System.out.println("Subtraction of two numbers :"+c);
		}
		public static void Multiplication(int c,int d)
		{
			int e=c*d;
			System.out.println("Multiplication of two numbers : "+e);
		}
		public static void Division(int c,int d)
		{
			int e=c/d;
			System.out.println("Division of two numbers : "+e);
		}

		}


