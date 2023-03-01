/** 
 * program to declare a variable as number1, number2, number3, number4 
 * assign values and reassign values and print it
 * @author Nithya M (Jamocha)
 * @version 1.0
 * @since 23/11/2022
 */
package com.sequence;
class FourNumbers
{
	public static void main(String args[])
	{
		int number1 = 100, number2 = 200, number3 = 300, number4 =100;
		number4 = number3;
		number3 = number2;
		number2 = number1;
		number1 = 100;
		System.out.println(number1 + " " + number2 + " " 
		+ number3 + " " + number4);		
	}
}