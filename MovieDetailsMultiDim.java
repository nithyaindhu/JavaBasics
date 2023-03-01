/** this class MovieDetailsMultiDim implements a application that will allow user
 *to multiple  of same datatype
 *@author Nithya M (Jamocha)
 *@version 1.0
 *@since 25/11/2022
 */
package com.movies;
import java.util.*;
import java.lang.System.*;

@SuppressWarnings("unused")
class MovieDetailsMultiDim
{
	public static void main(String args[])
	{
		Scanner read = new Scanner (System.in);
		System.out.print("Enter the no of movies : ");
		int movies = read.nextInt();
		System.out.print("Enter the no of movie fields : ");
		int movieFields = read.nextInt();
		read.nextLine();
		String movieList[][]=new String[movies][movieFields];


		for(int i=0; i<movies ; i++)
		{
			for(int j=0;j<movieFields;j++)
			{
				movieList	[i][j] = read.nextLine();
			}
		}


		for (String i[] : movieList)
		{
			for(String j : i)
			{
				System.out.print(j+"\t");
			}
			System.out.println();
		}
		
		System.out.print("Enter the movie name to search : ");
		String movieSearch = read.nextLine();
		int count =1;
		for (String i[] : movieList)
		{
			for(String j : i)
			{
				if(j.equalsIgnoreCase(movieSearch) || count==1)
				{
					for(String k : i)
					{
						System.out.print(k+"\t");
					}
					System.out.println();
					if(count!=1)
					{
						System.exit(0);
					}
					count++;
				}
			}
			//System.out.println();
			
		}
		read.close();
	}
}