/** 
 * This Class WhileStructure implements an application that illustrates while loop
 * control statements
 * @author Nithya M (Jamocha)
 * @version 1.0
 * @since 24/11/2022
 */
package com.loops;
import java.util.*;

@SuppressWarnings("unused")
class WhileStructure
{
	public static void main(String args[])
	{
		byte counter = 1;
		while (counter < 11)
		{
			System.out.println(counter);
			counter++;
		}
	}
}