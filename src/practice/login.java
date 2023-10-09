package practice;

import java.util.Scanner;

public class login {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		String valida="Admin";
		String b="Pass123";
		
		String name=sc.nextLine();
		name=name.toLowerCase();
		String pass=sc.nextLine();
		if(name.equals(valida) && pass.equals(b))
		{
			System.out.println("dfghjkl");
		}
		else {
			System.out.println("fail");
		}
		
	}
}