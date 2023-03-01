/** 
 * the IfControlStructure class implements an application to illustrate 
 * if-else decision making
 * @author Nithya M (Jamocha)
 * @version 1.1
 * @since 24/11/2022
 */
package com.condition;
class IfElseControlStructure
{
	public static void main(String args[])
	{
		boolean isMoving = true;
		int currentSpeed = 10;
		
		if(isMoving)	//checking condition
		{
			currentSpeed--;
			System.out.println("the bicycle speed got reduced to "+ currentSpeed); // prints currentSpeed
		}
		else
		{
			System.out.println("the bicycle is already got stopped!!!");
		}
	}
}
