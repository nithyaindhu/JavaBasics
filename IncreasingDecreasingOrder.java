/**
 * 
 */
package com.controlstructure;

/**this class IncreasingDecreasingOrder implements class which finds the order of 3 numbers
 * @author HP
 * @since 29/11/2022
 */
import java.util.Scanner;
public class IncreasingDecreasingOrder {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner(System.in);
		System.out.println("Enter number1 : ");
		int number1 = read.nextInt();
		System.out.println("Enter number2 : ");
		int number2 = read.nextInt();
		System.out.println("Enter number3 : ");
		int number3 = read.nextInt();
		
		if(number1 > number2 && number2 > number3)
		{
			System.out.println("Decreasing order !!!");
		}
		else if(number1 < number2 && number2 <number3)
		{
			System.out.println("Increasing order !!!");
		}
		else
		{
			System.out.println("Neither Increasing nor Decreasing order !!!");
		}
		read.close();
		
	}

}
