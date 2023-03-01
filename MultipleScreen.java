/** this class MultipleScreen implements a application that will allow user to book ticket 
 * in next screen once 1 screen is filled 
 *@author Nithya M (Jamocha)
 *@version 1.0
 *@since 25/11/2022
 */
package com.movies;
import java.util.*;

class MultipleScreen
{
	public static void main(String args[])
	{
		Scanner read = new Scanner (System.in);
		
		boolean isUserWanted = true;
		int counter =1;
		int userChoice=0;
		int noOfTickets = 100; // 100 tickets in counter 1
		int bookedTickets = 0;

		while (isUserWanted)
		{
			
			System.out.println( noOfTickets + " tickets are available in counter " + counter ); // shows no of tickets are available
			System.out.print("Enter how many tickets do you want to book : "); //ask user how many tickets they want
			int userTickets = read.nextInt();
			int flag =0;
			
			
			
			while (bookedTickets <=100 && flag ==0)
			{
				if((bookedTickets + userTickets)>100)
				{
					System.out.println("only " + (100 - bookedTickets) + " tickets are available ");
					System.out.println("Enter 1 if it is okay for you to get " + (100 - bookedTickets) + " in counter " + counter + " and " + ( (bookedTickets+ userTickets) - 100 ) + " in counter " + (counter+1) );
					userChoice = read.nextInt(); 
					if(userChoice ==1 )
					{
						System.out.println("Congradulations !!! Your ticket is booked " + (100 - bookedTickets) + " in counter " + counter + " and " + ( (bookedTickets+ userTickets) - 100 ) + " in " + (counter+1) +" Thank you ! come again !!!" );
						counter += 1;
						bookedTickets = ( (bookedTickets+ userTickets) - 100 );
						noOfTickets = 100 - bookedTickets;
					}
					else
					{
						System.out.println("Thank you for visiting us !!!");
					}	
				}
				else
				{
					bookedTickets += userTickets ;
					noOfTickets -= bookedTickets;
					System.out.println("Congradulations !!! Your ticket is booked ");
					if( noOfTickets ==0)
					{
						bookedTickets = 0 ;
						noOfTickets = 100;
						counter +=1;
					}
				}
				flag = 1;
			}
			System.out.println("Enter 1 if you want to book again : ");
			userChoice = read.nextInt();
			
			if(userChoice ==1)
			{
				isUserWanted = true;
			}
			else
			{
				isUserWanted = false;
			}
		}
				


		read.close();
	}
}
