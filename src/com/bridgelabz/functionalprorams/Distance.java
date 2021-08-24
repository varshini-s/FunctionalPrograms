package com.bridgelabz.functionalprorams;

public class Distance 
{

	public static void main(String[] args) 
	{
		int x, y;
		double euclideanDistance=0;
		x=Integer.parseInt(args[0]);
		y=Integer.parseInt(args[1]);
		
		euclideanDistance=  Math.sqrt((Math.pow(x,2) + Math.pow(y,2)));
		
		System.out.println("The euclidean Distance for points "+x+" "+y+"is "+euclideanDistance);


	}

}
