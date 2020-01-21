//Donark Patel
//CSC-162-C1
//Lab 7C

import java.util.Scanner;
public class Ackermann
{
	public static void main (String [] args)
	{
		int num1,
			num2;

		Scanner keyboard = new Scanner (System.in);

		System.out.println ("Enter Number 1");
		num1 = keyboard.nextInt();

		System.out.println ("Enter Number 2");
		num2 = keyboard.nextInt();

		ackermann(num1,num2);

		System.out.println("Value of Ackermann ("+ num1+ "," +num2+ ") = " + ackermann(num1,num2));
		System.out.println();
		System.out.println("Donark Patel");
		System.out.println("CSC 162-C1");
		System.out.println("Lab 7C");
	}

	public static int ackermann(int m , int n)
	{
		if(m==0)
			return n+1;
		else if(n==0)
			return ackermann(m-1,1);
		else
			return ackermann(m-1, ackermann(m, n-1));
	}
}


