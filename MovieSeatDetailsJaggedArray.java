/** this class MovieDetailsJaggedArray implements a application that will allow user
 *to multiple  of same datatype and count no of seats filled in each category
 *@author Nithya M (Jamocha)
 *@version 1.0
 *@since 25/11/2022
 */
package com.movies;
import java.util.*;
import java.lang.System.*;

@SuppressWarnings("unused")
class MovieSeatDetailsJaggedArray
{
	public static void main(String args[])
	{
		Scanner read = new Scanner (System.in);
		System.out.print("Enter the no of seat type : ");
		int seatType = read.nextInt();
		read.nextLine();
		String movieSeats[][] = new String[seatType][];
		

		for(int i=0; i<seatType ; i++)
		{
			System.out.print("Enter the no of seat for movie "+ i +" : ");
			int noOfSeats = read.nextInt();
			read.nextLine();
			movieSeats[i] = new String[noOfSeats+1];
			for(int j = 0; j <= noOfSeats; j++)
			{
				int flag =1;
				do{
				movieSeats [i][j] = read.nextLine();
				if((movieSeats[i][j]).equalsIgnoreCase("0") || (movieSeats[i][j]).equalsIgnoreCase("1") ||(movieSeats[i][j]).equalsIgnoreCase("gold") ||(movieSeats[i][j]).equalsIgnoreCase("platinum")||(movieSeats[i][j]).equalsIgnoreCase("regular"))
				{
					flag =0;
				} 
				}while(flag==1);  
			}
		}


		for (String i[] : movieSeats)
		{
			int countFilled = -1, countNotFilled = 0;
			System.out.println(i[0]+ " : \nAvailable seats are : ");
			int seats =0;
			for(String j : i)
			{
				seats++;
				if(j.equals("0"))
				{
					System.out.print(seats + " ");
					countNotFilled++;
				}
				else
				{
					countFilled++;
				}
			}
			System.out.println("\nseats filled : " +countFilled + " \nseats not filled : " + countNotFilled);
		}
		
		
		read.close();
	}
}