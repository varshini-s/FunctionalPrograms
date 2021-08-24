package com.bridgelabz.functionalprorams;
import java.util.Scanner;  


public class Quadratic 
{

	public static void main(String[] args) 
	{
		int a,b,c;
		Scanner input = new Scanner(System.in);  
		System.out.print("Enter the value of a: ");  
		a = input.nextInt();  
		System.out.print("Enter the value of b: ");  
		b = input.nextInt(); 
		System.out.print("Enter the value of c: ");  
		c = input.nextInt(); 
		 
		double delta= b * b - 4 * a * c;  
		
		double root1 = (-b + Math.sqrt(delta)) / (2 * a);  
		double root2 = (-b - Math.sqrt(delta)) / (2 * a);  
		System.out.println("The roots are " + root1 + " and " + root2);  
		 
		
		

	}

}
