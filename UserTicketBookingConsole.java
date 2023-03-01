/** 
 * This Class UserTicketBooking implements the user to login into his account 
 * and then it allows then to book the ticket
 * @author Nithya M (Jamocha)
 * @version 1.4
 * @since 23/11/2022
 */

package com.movies;
import java.util.*;
import java.io.Console;

class UserTicketBookingConsole
{
	public static void main(String args[])
	{
		Scanner read = new Scanner (System.in);
		String userName = "Nithya" , userPassword = "Nithya@12345";
		System.out.println("Enter 1 for Existing user, 2 for new user !!!");
		int check = read.nextInt();
		read.nextLine();
		int availableTickets = 10;	
		
		Console console = System.console();
		if(check == 1)
		{
			System.out.print("Enter your user name : ");
			if( userName.equals(read.nextLine()))
			{
				System.out.print("Enter your password : ");
				if( userPassword.equals(new String(console.readPassword()))) // console wont work in ide console designed for cmd prompt
				{

					System.out.print("Available Seat Catagories are \n Regular \n Platinum \n Gold \nYour choice is ");
					String seatCatagory = read.nextLine();


					if(seatCatagory.equalsIgnoreCase("Regular"))	//checking condition
					{
						System.out.println("Welcome, to sathyam Theatres !!!");
						System.out.println(availableTickets + " seats are available in regular!!! \ncost per seat : 1000");
						availableTickets--;
					}
					else if(seatCatagory.equalsIgnoreCase("Premium"))//checking condition
					{
						System.out.println("Welcome, to sathyam Theatres !!!");
						System.out.println(availableTickets + " seats are available in platinum!!! \ncost per seat : 10000");
						availableTickets--;
					}
					else if(seatCatagory.equalsIgnoreCase("Gold")) 
					{
						System.out.println("Welcome, to sathyam Theatres !!!");
						System.out.println(availableTickets + " seats are available in gold!!! \ncost per seat : 5000");
						availableTickets--;
					}
					else 
					{
						System.out.println("Your choice doesn't match our option !!!");
					}					
				}
				else
				{
					System.out.println("Please, Enter correct password !!!");
				}
			}
			else
			{
				System.out.println("Please, Enter correct username !!!");
			}
		}
		else
		{
			System.out.println("Create your username : ");
			userName = read.nextLine();
			System.out.println("Create your userpassword : ");
			userPassword = read.nextLine();
		}
		read.close();
	}
}
