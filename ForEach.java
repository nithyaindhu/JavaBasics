/** 
 * This Class ForEach implements the application to to find the max number in 
 * array using for each
 * @author Nithya M (Jamocha)
 * @version 1.0
 * @since 24/11/2022
 */
package com.loops;
import java.util.*;

class ForEach
{
	public static void main(String args[])
	{
		Scanner read = new Scanner (System.in);
		int arraySize = read.nextInt();
		int array[] = new int [arraySize];
		
		for(int i=0; i<arraySize; i++)
		{
			array[i]=read.nextInt();
		}
		int maxArrayElement = array[0];
		for(int i : array)
		{
			if(i>maxArrayElement)
			{
				maxArrayElement =array[i];
			}
		}
		System.out.println(maxArrayElement);
		read.close();
	}
}