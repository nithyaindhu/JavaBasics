/** this class AlternatingNumbers implements a application that will print maximum
 * revenue reached in each day
 *@author Nithya M (Jamocha)
 *@version 1.0
 *@since 25/11/2022
 */
package com.arrays;
import java.util.*;

class AlternatingNumbers
{
	public static void alternating(int array[],int number)
	{
		  int even=0,odd=0;
		  if (number/2==0)
		  {
		      even=number/2;
		      odd=number/2;
		  }
		  else if(array[0]%2==0)
		  {
		      even=number/2+1;
		      odd=number/2;
		  }
		  else
		  {
		      even=number/2;
		      odd=number/2+1;
		  }
		  int evenArray[]=new int [even];
		  int oddArray[]=new int [odd];
		  int evenIndex=0,oddIndex=0;
		  for(int i=0;i<number;i++)
		  {
		      if(array[i]%2==0)
		      {
		          evenArray[evenIndex++]=array[i];
		      }
		      else
		      {
		          oddArray[oddIndex++]=array[i];
		      }
		  }
		  
		  if(array[0]%2==0)
		  {
		      for(int i=0;i<number/2;i++)
		      {
	                if(number%2==0)	  
	                {
	                    System.out.print(evenArray[i]+" ");
	                    System.out.print(oddArray[i]+" ");
	                }
	                else
	                {
	                    System.out.print(evenArray[i]+" ");
	                    if(i!=number/2)
	                    {
	                        System.out.print(oddArray[i]+" ");
	                    }
	                }
		      }
		  }
		  else
		  {
		      for(int i=0;i<number/2;i++)
		      {
	                if(number%2==0)	  
	                {
	                    System.out.print(oddArray[i]+" ");
	                    System.out.print(evenArray[i]+" ");
	                }
	                else
	                {
	                    System.out.print(oddArray[i]+" ");
	                    if(i!=number/2)
	                    {
	                        System.out.print(evenArray[i]+" ");
	                    }
	                }
		      }
		  }

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
		alternating(array,arraySize);

		read.close();
	}
}