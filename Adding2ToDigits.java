/**
 * 
 */
package com.controlstructure;

/**
 * @author HP
 *
 */
import java.util.Scanner;
public class Adding2ToDigits {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int number = read.nextInt();
		int rev = 0, rem = 0;
		while(number!=0)
		{
			rem = number % 10 + 2;
			if(rem/10 !=0)
			{
				rev =rev *10 + rem % 10;
			}
			else
			{
				rev =rev *10 + rem;
			}
			number /= 10;
		}
		while(rev!=0)
		{
			number =number*10 + rev%10;
			rev/=10;
		}
		System.out.println(number);
		read.close();
	}

}
