/** this class RotatingArray implements a application that will print maximum
 * revenue reached in each day
 *@author Nithya M (Jamocha)
 *@version 1.0
 *@since 25/11/2022
 */
package com.arrays;
import java.util.*;

class RotatingArray
{
	public static void shifting(int array[],int arraySize)
	{
		int temp  = array[0];
		for ( int i = 0 ; i< arraySize-1 ; i++)
		{
			array[i]=array[i+1];
		}
		array[arraySize-1]=temp; 
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
		System.out.println("Enter the no of time array needs to rotate : ");
		int times = read.nextInt();
		for(int i = 0; i<times ; i++)
		{
			shifting(array,arraySize);
		}
		for(int i = 0; i<arraySize; i++)
		{
			System.out.print(array[i]+" ");
		}
		read.close();
	}
}