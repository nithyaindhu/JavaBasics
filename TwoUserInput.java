/** 
 * program to get 2 name as user input and print it as welcome + name + welcome name1 too
 * @author Nithya M (Jamocha)
 * @version 1.0
 * @since 24/11/2022
 */
package com.sequence;
import java.util.Scanner;

class TwoUserInput
{
	public static void main(String args[])
	{
		Scanner read = new Scanner (System.in);
		String person1 = read.nextLine();
		String person2 = read.nextLine();
		System.out.println("Welcome " + person1 + "! Welcome " + person2 +" too!");
		read.close();
	}
}
 