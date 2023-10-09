package practice;

import java.util.Scanner;

public class turanry_operator {
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	int marks=sc.nextInt();
	//variable= codition? statement1:statement2; .....
	String result=(marks>=35)?"Pass":"Fail";
	System.out.println(result);
}
}
