/** this class InsertingInArray implements a application that will print insert an element in an array
 *@author Nithya M (Jamocha)
 *@version 1.0
 *@since 27/11/2022
 */
package com.arrays;
import java.util.*;

class InsertingInArray
{
	public static void inserting(int array1[],int array[],int arraySize, int iElement,int iPos)
	{
		int j=0;
		for(int i=0; i<arraySize ; i++)
		{
			if( i == iPos-1)
			{
				array1[j++] = iElement;
				array1[j++] = array[i];
			}
			else
			{
				array1[j++] = array[i];
			}
		}
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
		int iElement = read.nextInt();
		int iPos = read.nextInt();
		int array1[] = new int [arraySize+1];
		inserting(array1,array, arraySize, iElement, iPos);
		for(int i=0;i<=arraySize ; i++)
		{
			System.out.print(array1[i]+ " " );
		}
		read.close();
	}
}
