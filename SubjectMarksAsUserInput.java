/** 
 * program to get marks as user input and assign it to 
 * variable to Tamil, English and French
 * assign marks and print it
 * @author Nithya M (Jamocha)
 * @version 1.0
 * @since 24/11/2022
 */
package com.sequence;
import java.util.Scanner;

class SubjectMarksAsUserInput
{
	public static void main(String args[])
	{
		Scanner read = new Scanner (System.in);
		byte Tamil, English, French;
		Tamil = read.nextByte() ;
		English = read.nextByte();
		French = read.nextByte();
		System.out.println("Tamil : " + Tamil + "\nEnglish : " + English 
		+ "\nFrench : " + French);
		read.close();
	}
}
