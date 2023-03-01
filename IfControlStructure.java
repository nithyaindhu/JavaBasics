/** 
 * the IfControlStructure class implements an application to illustrate 
 * if decision making
 * @author Nithya M (Jamocha)
 * @version 1.0
 * @since 24/11/2022
 */
package com.condition;
class IfControlStructure
{
	public static void main(String args[])
	{
		boolean isMoving = true;
		int currentSpeed = 10;
		
		if(isMoving)	//checking condition
		{
			System.out.println(currentSpeed); // prints 10
		}
	}
}
