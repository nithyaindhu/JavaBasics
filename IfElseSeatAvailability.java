/** 
 * the SeatAvailability class implements an application to check the seat availability
 * status for movie ticket booking using if-else
 * @author Nithya M (Jamocha)
 * @version 1.2
 * @since 24/11/2022
 */
package com.condition;
import java.util.Scanner;
@SuppressWarnings("unused")
class IfElseSeatAvailability
{
	public static void main(String args[])
	{
		int noOfSeatsAvailable =22;
		boolean isAvailable = true;
		if(isAvailable) 
		{
			System.out.println(noOfSeatsAvailable + " Seats are available");
			noOfSeatsAvailable--;
			
		}
		else 
		{
			System.out.println(":} Teatre is full !!!");
		}
	}
}
