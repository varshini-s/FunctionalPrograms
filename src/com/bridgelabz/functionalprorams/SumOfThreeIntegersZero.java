package com.bridgelabz.functionalprorams;

import java.util.Scanner;

public class SumOfThreeIntegersZero 
{

	public static void main(String[] args)
	{
		
		int numberOfIntegers;
		boolean foundTriplets=false;
		
		//Declaring scanner class for input
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Number of integers value");
		numberOfIntegers=scanner.nextInt();
		
		int array[]= new int[numberOfIntegers];
		System.out.println("Enter "+numberOfIntegers+"  array values");
		for(int index=0;index<numberOfIntegers;index++)
		{
			array[index]=scanner.nextInt();

		}
		
		for (int index1=0; index1<numberOfIntegers-2; index1++)
	    {
	        for (int index2=index1+1; index2<numberOfIntegers-1; index2++)
	        {
	            for (int index3=index2+1; index3<numberOfIntegers; index3++)
	            {
	                if (array[index1]+array[index2]+array[index3] == 0)
	                {
	                    System.out.print(array[index1]);
	                    System.out.print(" ");
	                    System.out.print(array[index2]);
	                    System.out.print(" ");
	                    System.out.print(array[index3]);
	                    System.out.print("\n");
	                    foundTriplets = true;
	                }
	            }
	        }
	    }
		scanner.close();
	}

}
