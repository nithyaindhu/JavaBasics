/**
 * 
 */
package com.controlstructure;

/**this class ChangeNumber implements an application that prints o/p based on number
 * whether it is odd or even
 * @author HP
 * @since 29/11/2022
 */
import java.util.Scanner;
public class ChangeNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner read = new Scanner (System.in);
		int currentNumber = read.nextInt();
		if(currentNumber%2 ==0)
		{
			System.out.println(currentNumber/2);
		}
		else
		{
			System.out.println(3*currentNumber + 1);
		}
		read.close();
	}

}
