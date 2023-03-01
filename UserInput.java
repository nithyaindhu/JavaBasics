/** 
 * program to get name as user input and print it as welcome + name
 * @author Nithya M (Jamocha)
 * @version 1.0
 * @since 24/11/2022
 */
package com.sequence;
import java.util.Scanner;

class UserInput
{
	public static void main(String args[])
	{
		Scanner read = new Scanner (System.in);
		String name = read.nextLine();
		System.out.println("Welcome " + name + " !");
		read.close();
	}
}
