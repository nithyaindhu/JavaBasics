/** 
 * This Class UserTicketBooking implements the Multiple user to login into his account 
 * and then it allows then to book the ticket
 * @author Nithya M (Jamocha)
 * @version 1.4
 * @since 23/11/2022
 */

package com.movies;
import java.util.*;
import java.io.Console;

class MultipleUserMovieTicketBooking
{
	public static void main(String args[])
	{
		Scanner read = new Scanner (System.in);
		String userName = "Nithya" , userPassword = "Nithya@12345";
		boolean isUserWanted = true;
		
        	int availableTickets = 10;	
		
		//int availableTicketsForTamil[][]={{23,24,25},{12,13,14},{15,16,17}};

		while(isUserWanted)
		{
        	System.out.println("Enter 1 for Existing user, 2 for new user !!!");
        	int check = read.nextInt();
        	read.nextLine();
        	
        	Console console = System.console();
        	if(check == 1)
        	{
        		System.out.print("Enter your user name : ");
        
        		if( userName.equals(read.nextLine()))
        		{
        			System.out.print("Enter your password : ");
        			if( userPassword.equals(new String(console.readPassword())))
        			{
        				System.out.println("Welcome, to sathyam Theatres !!!");
        
        				System.out.println("Available Languages : \nTamil \nEnglish \nkorean");
        				System.out.println("Select language to display movies : ");
        				String movieLanguage = (read.nextLine()).toLowerCase();
        				String movieName = "";					
        
        				switch(movieLanguage)
        				{
        					case "tamil":
        						System.out.println("Available Movies : \nRaja Rani \nSuryavamsam \nI");
        						System.out.println("Enter your option : ");
        						String choice = read.nextLine().toLowerCase();
        						
        						switch(choice)
        						{
        							case "raja rani":
        								movieName = "Raja Rani";
        								break;
        							case "suryavamsam":
        								movieName = "Suryavamsam";
        								break;
        							case "i":
        								movieName = "I";
        								break;
        						}
        						break;
        					case "english":
        						System.out.println("Available Movies : \nSpider Man \nIron Man \nHome Alone");
        						System.out.println("Enter your option : ");
        						choice = read.nextLine().toLowerCase();
        						
        						switch(choice)
        						{
        							case "spider man":
        								movieName = "Spider Man";
        								break;
        							case "iron man":
        								movieName = "Iron Man";
        								break;
        							case "home alone":
        								movieName = "Home Alone";
        								break;
        						}
        						break;
        					case "korean":
        						System.out.println("Available Movies : \nSquid Game \nTrain to Bushan \nReset");
        						System.out.println("Enter your option : ");
        						choice = read.nextLine().toLowerCase();
        						
        						switch(choice)
        						{
        							case "squid game":
        								movieName = "Squid Game";
        								break;
        							case "train to bushan":
        								movieName = "Train to Bushan";
        								break;
        							case "reset":
        								movieName = "Reset";
        								break;
        						}
        						break;
        				}
        
        				System.out.print("Available Seat Catagories are \n Regular \n Platinum \n Gold \nYour choice is ");
        				String seatCatagory = read.nextLine();
        				
        				if(seatCatagory.equalsIgnoreCase("Regular"))	//checking condition
        				{
        					System.out.println(availableTickets + " seats are available in regular for " + movieName + " !!! \ncost per seat : 1000");
        					
						if(availableTickets==0)
						{
							System.out.println("Sorry, Tickets Sold Out !!!");
							break;
						}
						System.out.println("Enter how many tickets you want to book : ");
						int ticketsChoice = read.nextInt();
						
						if (availableTickets-ticketsChoice<0)
						{
							System.out.println("only "+availableTickets + " are available !!!");
							break;
						}
						availableTickets-=ticketsChoice;
						System.out.println(ticketsChoice + " tickets booked Successfully!!!");
						read.nextLine();
        				}
        				else if(seatCatagory.equalsIgnoreCase("Premium"))//checking condition
        				{
        					System.out.println(availableTickets + " seats are available in platinum for " + movieName + " !!! \ncost per seat : 10000");
						if(availableTickets==0)
						{
							System.out.println("Sorry, Tickets Sold Out !!!");
							break;
						}
        					System.out.println("Enter how many tickets you want to book : ");
						int ticketsChoice = read.nextInt();
						if (availableTickets-ticketsChoice<0)
						{
							System.out.println("only "+availableTickets + " are available !!!");
							break;
						}
						availableTickets-=ticketsChoice;
						System.out.println(ticketsChoice + " tickets booked Successfully!!!");
						read.nextLine();
        				}
        				else if(seatCatagory.equalsIgnoreCase("Gold")) 
        				{
        					System.out.println(availableTickets + " seats are available in gold for " + movieName + " !!! \ncost per seat : 5000");
						if(availableTickets==0)
						{
							System.out.println("Sorry, Tickets Sold Out !!!");
							break;
						}
        					System.out.println("Enter how many tickets you want to book : ");
						int ticketsChoice = read.nextInt();
						if (availableTickets-ticketsChoice<0)
						{
							System.out.println("only "+availableTickets + " are available !!!");
							break;
						}
						availableTickets-=ticketsChoice;
						System.out.println(ticketsChoice + " tickets booked Successfully!!!");
						read.nextLine();
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
			System.out.println("Account Created successfully !!!");
        	}
		System.out.println("Do you want to login again? Enter yes or no");
		if(read.nextLine().equalsIgnoreCase("yes"))
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
