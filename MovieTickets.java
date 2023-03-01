/** this class EnumExample implements a application that will print show the implementation
 * of enum
 *@author Nithya M (Jamocha)
 *@version 1.0
 *@since 25/11/2022
 */
package com.movies;
import java.util.*;

enum Seats
	{
		GOLD(100),PLATINUM(100),REGULAR(200);
		private int totalSeats;
		private Seats(int totalSeats)
		{
			this.totalSeats = totalSeats;
		}
		int getTotalSeats()
		{
			return totalSeats;
		}
		void setTotalSeats(int seats)
		{
			totalSeats -= seats;
		}
	}
class MovieTickets
{
	public static void switchSeats(Seats type , int seats)
	{
		switch(type)
		{
			case GOLD:
				if(type.getTotalSeats() >= seats)
				{
					type.setTotalSeats(seats);
					System.out.println( seats + " got booked in GOLD Category !!!");
				}
				else
				{
					System.out.println("Only " + type.getTotalSeats() + " seats are available in GOLD !!! try again !!!");
				}
				break;
			case PLATINUM:
				if(type.getTotalSeats() >= seats)
				{
					type.setTotalSeats(seats);
					System.out.println( seats + " got booked in PLATINUM Category !!!");
				}
				else
				{
					System.out.println("Only " + type.getTotalSeats() + " seats are available in PLATINUM !!! try again !!!");
				}
				break;
			case REGULAR:
				if(type.getTotalSeats() >= seats)
				{
					type.setTotalSeats(seats);
					System.out.println( seats + " got booked in REGULAR Category !!!");
				}
				else
				{
					System.out.println("Only " + type.getTotalSeats() + " seats are available in REGULAR !!! try again !!!");
				}
				break;
		}
		
	}
	public static void main(String args[])
	{
		Scanner read = new Scanner (System.in);
		Seats seat = Seats.GOLD;
		System.out.println(seat.getTotalSeats());
		
		System.out.println("The number of seats available in each category: ");
		for( Seats s : Seats.values())
		{
			System.out.println(s+ " " + s.getTotalSeats());	
		}
		System.out.println("Enter the category of seats you want to book : ");
		String seatType = (read.nextLine()).toUpperCase();
		System.out.println("Enter how many seats do you want : ");
		int seats = read.nextInt();
		if((Seats.valueOf(seatType)).equals(Seats.GOLD))
		{
			switchSeats(Seats.GOLD, seats);
		}
		else if((Seats.valueOf(seatType)).equals(Seats.PLATINUM))
		{
			switchSeats(Seats.PLATINUM, seats);
		}
		else
		{
			switchSeats(Seats.REGULAR, seats);
		}
		System.out.println("The number of seats available in each category: ");
		for( Seats s : Seats.values())
		{
			System.out.println(s+ " " + s.getTotalSeats());	
		}
		read.close();
	}
}