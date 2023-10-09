package practice;

import java.util.Scanner;

public class Calculator_1 {
	
public static void main(String []args)
{
	Scanner sc=new Scanner(System.in);
	boolean canIrunthecode=true;
	while(canIrunthecode) {
     System.out.println("**************SIMPLE CALCULATOR************\n");
	System.out.println("Enter 1st no:");
	int a=sc.nextInt();
	System.out.println("Enter 2nd no:");
	int b=sc.nextInt();
	System.out.println("1.+   2.-   3.*   4./   5.%  \n");
	//System.out.println("2.-");
	//System.out.println("3.*");
    //System.out.println("4./");
    //System.out.println("5.%");
    //System.out.println("6.Quit \n");
    System.out.println("choose operator (+,-,*,/,%)");
    int choise=sc.nextInt();
    if(choise==6)
    {
    	 canIrunthecode=false;
    	System.out.println("CLOSE PROGRA!!!");
    	
    }
    else if(choise==1) {
    	int c=add(a,b);
    	System.out.println("Addition is :"+c+"\n");
    }
    else if(choise==2) {
    	System.out.println("Sustraction is :"+sub(a,b)+"\n");
    }
    else if(choise==3)
    {
    	int d=mul(a,b);
    	System.out.println("Multiplication is :"+d+"\n");
    }
    else if (choise==4)
    {
    	int e=div(a,b);
    	System.out.println("Division is :"+e+"\n");
    	
    }
    else if(choise==5)
    {
    	System.out.println("Modulus is :"+mod(a,b)+"\n");
    }
    else {
    	System.out.println("-------End------");
    }
	}
}
public static int add(int a,int b)
{
	return a+b;
}
public static int sub(int a,int b)
{
	return a-b;
}
public static int mul(int a,int b)
{
	return a*b;
	
}
public static int div(int a,int b)
{
 int c=a/b;
 return c;
}
public static int mod(int a,int b)
{
	int c=a%b;
	return c;
}

}
