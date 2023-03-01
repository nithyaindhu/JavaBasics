/**
 * 
 */
package com.functions;

/** this class SumOfEvenOdd defines the application that prints sum of even and
 * odd numbers
 * @author HP
 * @since 28/11/2022
 */

import java.util.Scanner;
public class SumOfEvenOddA {

	/**
	 * @param args
	 */
	public static int sumOfEven(int number1, int number2)
	{
		int even = 0 ;
		for(int i=number1 ; i<=number2 ; i++)
		{
			if(i%2==0)
			{
				even +=i;
			}
		}
		return even;
	}
	public static int sumOfOdd(int number1, int number2)
	{
		int odd = 0 ;
		for(int i=number1 ; i<=number2 ; i++)
		{
			if(i%2 != 0)
			{
				odd +=i;
			}
		}
		return odd;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner (System.in);
		System.out.print("Enter the number1 and number2 : ");
		int number1 = read.nextInt();
		int number2 = read.nextInt();
		int even=0, odd =0;
		System.out.println("sum of even : " + (even = sumOfEven(number1,number2)) 
		+ "\nsum of odd : " + (odd = sumOfOdd(number1,number2)));
		System.out.println( "absolute difference is : " + Math.abs(even-odd));
		read.close();
	}

}
