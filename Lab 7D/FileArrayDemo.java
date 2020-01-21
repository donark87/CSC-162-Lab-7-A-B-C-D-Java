//Donark Patel
//CSC-162-C1
//Lab 7D

import java.io.*;
public class FileArrayDemo
{

	public static void main(String[] args)throws IOException
	{
		int [] numbers = {1,2,3,4,5,6,7,8};
		int [] test = new int[8];

		try
		{
			FileArray object  = new FileArray(numbers);
			object.writeArray(numbers);
		}
		catch (IllegalArgumentException e)
		{
			System.out.println(e.getMessage());
		}

		try
		{
			FileArray object1  = new FileArray(test);
			object1.readArray(test);
		}
		catch (IllegalArgumentException e)
		{
			System.out.println(e.getMessage());
		}

		System.out.println("Donark Patel");
		System.out.println("CSC 162-C1");
		System.out.println("Lab: 7D");
	}
}



