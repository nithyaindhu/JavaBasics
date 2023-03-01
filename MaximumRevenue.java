/** this class MaximumRevenue implements a application that will print maximum
 * revenue reached in each day
 *@author Nithya M (Jamocha)
 *@version 1.0
 *@since 25/11/2022
 */
package com.arrays;
import java.util.*;

class MaximumRevenue
{
	public static void findingMaximumRevenue(int array[][],int arraySize)
	{
		int k=1;
		for( int i[] : array)
		{
			int max = i[0];
			for(int j : i)
			{
				if(max < j)
				{
					max = j;
				}
			}
			System.out.println("Maximum revenue reached in day " + k++ );
			System.out.println(max);
		}
	}	
	public static void main(String args[])
	{
		Scanner read = new Scanner (System.in);
		System.out.println("Enter no of days : ");
		int arraySize = read.nextInt();
		int array[][] = new int [arraySize][];
		for( int i = 0 ; i <arraySize ; i++)
		{
			System.out.println("Enter the no of products : ");
			int k = read.nextInt();
			array[i] = new int [k];
			System.out.println("Enter the price for each product : ");
			for( int j = 0; j < k ; j++)
			{
				array[i][j] = read.nextInt();
			}
		}
		findingMaximumRevenue(array, arraySize);

		read.close();
	}
}