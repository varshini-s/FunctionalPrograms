package com.bridgelabz.functionalprorams;

import java.io.PrintWriter;
import java.util.Scanner;

public class TwodArray 
{
	public static void main(String args[]) 
	{
		int rowValue, columnValue;
		
		Scanner scanner = new Scanner(System.in);

		// input row and column numbers for array.
		System.out.print("Enter number of rows for array : ");
		rowValue = scanner.nextInt();
		System.out.print("Enter number of columns for array: ");
		columnValue = scanner.nextInt();

		int array[][] = new int[rowValue][columnValue];
		
		// input array elements.
		System.out.println("Enter " + (rowValue * columnValue) + " Array Elements : ");
		for (int index1 = 0; index1< rowValue; index1++) 
		{
			for (int index2 = 0; index2 < columnValue; index2++) 
			{
				array[index1][index2] = scanner.nextInt();
			}
		}

		// Printing array value
		System.out.print("The Array is :\n");
		for (int index1 = 0; index1< rowValue; index1++) 
		{
			for (int index2 = 0; index2 < columnValue; index2++) 
			{  

				System.out.print(array[index1][index2] + "  ");
			}
			System.out.println();
		}
		
		scanner.close();
	}

}
