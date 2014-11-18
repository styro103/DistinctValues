/*
 * Shaun Mbateng
 * This program has the user input an array, and then displays the number
 * 	of distinct elements in the array.
 * It has a time complexity of O(N*log(N))
 * 	(complexity is O(N) if sorting method isn't used).
 */

import java.util.Scanner;

public class Distinct 
{
	public static void main(String[] args) 
	{
		Scanner cin = new Scanner(System.in); //For Inputs
		int count1; //Count of Distinct Elements
		int count2; //Count of Distinct Elements
		int len; //Length of Array
		int [] A; //Array to Check
		DistinctCounters Set1 = new DistinctCounters();
		DistinctSort Set2 = new DistinctSort();
		
		//Enter and Set Array Length
		System.out.print("Enter the Array Length: ");
		len = cin.nextInt();
		A = new int [len];
		cin.close(); //No More Inputs Needed
		
		//Fill Arrays
		for (int i=0; i<len; i++)
		{
			System.out.print("Enter Element "+(i+1)+":");
			A[i] = cin.nextInt();
		}
		
		count1 = Set1.getCount(A); //Get Count Using Array of Counters
		count2 = Set2.getCount(A); //Get Count Using Sorting
		
		if (count1==count2) //If Equal, and Always Should be, Display
			System.out.println("Number of Distinct Elements: "+count1);
		else //Should Not Happen, but for Code Checking
		{
			System.out.println("Number of Distinct Elements:  1: "+count1);
			System.out.println("Number of Distinct Elements:  2: "+count2);
		}
	}
}