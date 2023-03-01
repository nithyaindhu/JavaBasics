/**
 * 
 */
package com.functions;

/** This class PrimeNumbersRange implements a application that find the prime numbers between the range
 * @author HP
 * @since 28/11/2022
 */
import java.util.Scanner;
public class PrimeNumbersRange {

	/**
	 * @param args
	 */
	public static boolean isPrime (int number)
	{
		for(int i = 2 ; i<= number/2 ; i++)
		{
			if(number%i == 0)
			{
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner (System.in);
		System.out.print("Enter from and to limit : ");
		 int number1 = read.nextInt();
		 int number2 = read.nextInt();
		 
		 if(number1 < number2)
		 {
		 for (int i=number1 ; i<=number2 ; i++)
		 {
			 if (i == 1 || i ==0)
			 {
				 continue;
			 }
			 else if(isPrime(i))
			 {
				 System.out.print(i + " ");
			 }
		 }
		 }
		 else
		 {
			 System.out.println("Enter valid input !!!");
		 }
		 read.close();
		 
	}

}
