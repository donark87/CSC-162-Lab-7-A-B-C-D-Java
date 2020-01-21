//Donark Patel
//CSC-162-C1
//Lab 7D

import java.io.*;
import java.util.Scanner;
public class FileArray
{
	private int[] num;

	public FileArray(int[] number)
	{
		num = new int[number.length];

		for (int i = 0; i < number.length; i++)
		{
			if(number[i] < 0 || number[i] > 8)
			{
				int num1 = number[i];
				System.out.println("Array index out of bound");
				throw new IllegalArgumentException("Invalid Subscript: "+(i));
			}
			num[i] = number[i];
		}
	}

	public void writeArray(int[] number1)
	{
		num = new int[number1.length];

		try
		{
			PrintWriter outFile = new PrintWriter ("MyInteger.txt");

			for(int i = 0; i < number1.length; i++)
			{
				 System.out.print(number1[i]);
				 outFile.println(number1[i]);
			}

			outFile.close( );
			System.out.println("\nArray Written to File MyInteger");
			System.out.println("\n__________________________________________");
		}
		catch (FileNotFoundException e)
		{
			System.out.println(e.getMessage());
		}
	}

	public void readArray(int[] number2)
	{
		num = new int[number2.length];

		try
		{
			File myFile = new File ("MyInteger.txt");
			Scanner  inFile = new Scanner (myFile);

			System.out.println("Test Array contains the following numbers: ");

			int str;
            int i = 0;

			while( inFile.hasNext())
			{
				number2[i] = inFile.nextInt();
				System.out.println(number2[i]);
				i++;
			}
			System.out.println("_________________________________________");
		}
		catch (IllegalArgumentException e)
		{
			System.out.println(e.getMessage());
		}
		catch(FileNotFoundException fnfe)
		{
			System.out.println(fnfe.getMessage());
		}
	}
}



