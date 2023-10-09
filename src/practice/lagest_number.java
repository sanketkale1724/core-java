package practice;

import java.util.Scanner;

public class lagest_number {
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	int a,b,c;
	System.out.println("Enter 1st number");
	a=sc.nextInt();
	System.out.println("Enter 2nd number");
    b=sc.nextInt();
	System.out.println("Enter 3rd number");
	c=sc.nextInt();
	if (a>=b && a>=c)
	{
		System.out.println("Greater number is"+a);
	}
	else if(b>=c)
	{
		System.out.println("Greater number is"+b);
		
	}
	else {
		System.out.println("GReater number is"+c);
	}
}
}
