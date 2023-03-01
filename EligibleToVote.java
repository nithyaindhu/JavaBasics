/**
 * 
 */
package com.functions;

/**A person is eligible to vote if his/her age is greater than or equal to 18.
 *  Define a method to find out if he/she is eligible to vote
 * @author HP
 * @since 28/11/2022
 */
import java.util.Scanner;
public class EligibleToVote {

	/**
	 * @param args
	 */
	public static boolean isEligible(int age)
	{
		if(age >= 18)
		{
			return true;
		}
		return false;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner (System.in);
		System.out.print("Enter your age : ");
		int age = read.nextInt();
		if(isEligible(age))
		{
			System.out.println("Eligible to vote !!!");
		}
		else
		{
			System.out.println("Not Eligible to vote !!!");
		}
		read.close();
	}

}
