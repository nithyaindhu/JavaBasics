/** 
 * This Class SearchingMovie implements the application to return the movie 
 * name based on genre we enter
 * @author Nithya M (Jamocha)
 * @version 1.0
 * @since 24/11/2022
 */

package com.movies;
import java.util.*;

class SearchingMovie
{
	public static void main(String args[])
	{
		Scanner read = new Scanner (System.in);
		int arraySize = read.nextInt();
		String movieName[] = new String [arraySize];
		String movieGenre[] = new String [arraySize];
		read.nextLine();
		for(int i=0; i<arraySize; i++)
		{
			movieName[i]=read.nextLine();
		}
		for(int i=0; i<arraySize; i++)
		{
			movieGenre[i]=read.nextLine();
		}
		System.out.println("Enter the movie genre to search : ");
		String genre = read.nextLine();
		int counter = 0;
		for(String i : movieGenre)
		{
			if(i.equalsIgnoreCase(genre))
			{
				System.out.println(movieName[counter]);
			}
			counter++;
		}
		read.close();
	}
}