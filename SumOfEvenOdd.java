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
public class SumOfEvenOdd {

	/**
	 * @param args
	 */
	public static int sumOfEven(int number)
	{
		int even = 0 ;
		for(int i=0 ; i<=number ; i+=2)
		{
			even +=i;
		}
		return even;
	}
	public static int sumOfOdd(int number)
	{
		int odd = 0 ;
		for(int i=1 ; i<=number ; i+=2)
		{
			odd +=i;
		}
		return odd;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner (System.in);
		System.out.print("Enter the number : ");
		int number = read.nextInt();
		System.out.println("sum of even : " + sumOfEven(number) 
		+ "\nsum of odd : " + sumOfOdd(number));
		read.close();
	}

}
