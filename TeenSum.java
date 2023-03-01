/**
 * 
 */
package com.controlstructure;

/**This class TeenSum implements an application that Given 2 integer values, ‘a’ and ‘b’, 
 * return their sum. However, "teen" values in the range
 * 13…19 inclusive, are extra lucky. So, if either value is a teen, just return 19.
 * @author HP
 * @since 29/11/2022
 */

import java.util.Scanner;
public class TeenSum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read =  new Scanner(System.in);
		System.out.println("Enter number1 : ");
		int number1 = read.nextInt();
		System.out.println("Enter number2 : ");
		int number2 = read.nextInt();
		
		if(number1 >=13 && number1<=19 ||number2 >=13 && number2<=19 )
		{
			 System.out.println(19);
		}
		else
		{
			System.out.println(number1+number2);
		}
		read.close();
	}

}
