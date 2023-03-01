/** this class AlternatingNumbers implements a application that will print maximum
 * revenue reached in each day
 *@author Nithya M (Jamocha)
 *@version 1.0
 *@since 25/11/2022
 */
package com.arrays;
import java.util.*;

class FindingSquare
{
	public static int square(int number)
	{
		for ( int i = 2 ; i<= number/2 ; i++)
		{
			if( number % i 	== 0 )
			{
				return 0;
			}
		}
		return 1; 
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
		int count = 0;
		for(int i = 0; i<arraySize ; i++)
		{
			if(square(array[i]) ==1 || array[i] == 1)
			{
				count++;
			}
		}
		System.out.println("the number of peoples are : " + count);
		read.close();
	}
}