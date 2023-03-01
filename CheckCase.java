/** 
 * This Class CheckCase implements that application to check char is upper or lower case
 * @author Nithya M (Jamocha)
 * @version 1.0
 * @since 24/11/2022
 */
package com.condition;
import java.util.*;

class CheckCase
{
	public static void main(String args[])
	{
		Scanner read = new Scanner (System.in);
		int letter = (int)(read.next().charAt(0));
		letter = (letter>=65 && letter <=90)  ? 1 : 0;
		switch(letter)
		{
			case 0:
				System.out.println("Lower Case letter");
				break;
			case 1:
				System.out.println("Upper Case letter");
				break;
		}
		read.close();
	}
}
