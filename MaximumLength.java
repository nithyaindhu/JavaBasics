/** this class MaximumLength implements a application that will print maximum
 * consecutive length
 *@author Nithya M (Jamocha)
 *@version 1.0
 *@since 25/11/2022
 */
package com.arrays;
import java.util.*;

class MaximumLength
{
	public static void findingMaximumLength(int array[],int arraySize)
	{
		int count = 1, prevCount =0 ;
		for(int i=0; i<arraySize-1; i++)
		{
			if((array[i] + 1) == array[i+1])	
			{
				count++;
			}
			else if ( prevCount < count )
			{
				prevCount = count;
				count =1;
			}
		}
		System.out.println(prevCount);
	}
	public static void sorting(int array[], int arraySize)
	{
		for(int i = 0 ; i<arraySize ; i++)
		{
			for(int j = 0 ; j<arraySize - i-1 ; j++)
			{
				if(array[j] > array[j+1])
				{
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
		//for( int i = 0 ; i < arraySize ; i++)
		//{
		//	System.out.println(array[i]);
		//}
	}
	public static void main(String args[])
	{
		Scanner read = new Scanner (System.in);
		int arraySize = read.nextInt();
		int array[] = new int [arraySize];
		for( int i = 0 ; i <arraySize ; i++)
		{
			array[i] = read.nextInt();
		}
		sorting(array,arraySize);
		findingMaximumLength(array,arraySize);

		read.close();
	}
}