/** 
 * the SeatAvailability class implements an application to check the seat availability
 * status for movie ticket booking using if-else - If
 * @author Nithya M (Jamocha)
 * @version 1.2
 * @since 24/11/2022
 */
package com.condition;
import java.util.Scanner;
class IfElseIfSeatAvailability
{
	public static void main(String args[])
	{
		Scanner read = new Scanner (System.in);
		
		System.out.print("Available Seat Catagories are \n Regular \n Platinum \n Gold \nYour choice is ");
		String seatCatagory = read.nextLine();


		if(seatCatagory.equalsIgnoreCase("Regular"))	//checking condition
		{
			System.out.println("Seats are available in regular!!! \ncost per seat : 1000");
		}
		else if(seatCatagory.equalsIgnoreCase("Premium"))//checking condition
		{
			System.out.println("Seats are available in platinum!!! \ncost per seat : 10000");
		}
		else if(seatCatagory.equalsIgnoreCase("Gold")) 
		{
			System.out.println("Seats are available in gold!!! \ncost per seat : 5000");
		}
		else 
		{
			System.out.println("Your choice doesn't match our option !!!");
		}
		read.close();
	}
}
