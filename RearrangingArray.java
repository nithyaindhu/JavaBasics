/** this class RearrangingArray implements a application that will arrange elements 
 * from positive to negative
 *@author Nithya M (Jamocha)
 *@version 1.0
 *@since 25/11/2022
 */
package com.arrays;
import java.util.*;
import java.lang.System.*;

@SuppressWarnings("unused")
class RearrangingArray
{
	public static void positiveToNegative(int array[],int arraySize)
	{
		int j = arraySize - 1,temp = 0;
		for( int i=0;i<arraySize && i!=j;)
		{
			if(array[i]<0)
			{
				if (array[j]>=0)
				{
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
					j--;
					i++;
				}
				else
				{
					j--;
				}
			}
			else
			{
				i++;
			}
		}
	}
			
	public static void main(String args[])
	{
		Scanner read = new Scanner (System.in);
		int arraySize = read.nextInt();
		int array[] = new int [arraySize];
		
		for( int i = 0; i<arraySize; i++)
		{
			array[i] = read.nextInt();
		}
		positiveToNegative(array,arraySize);
		for( int i = 0; i<arraySize; i++)
		{
			System.out.print(array[i]+ " ");
		}
		read.close();
	}
}