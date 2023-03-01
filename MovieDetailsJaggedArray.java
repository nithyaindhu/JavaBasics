/** this class MovieDetailsJaggedArray implements a application that will allow user
 *to multiple  of same datatype
 *@author Nithya M (Jamocha)
 *@version 1.0
 *@since 25/11/2022
 */
package com.movies;
import java.util.*;
import java.lang.System.*;

@SuppressWarnings("unused")
class MovieDetailsJaggedArray
{
	public static void main(String args[])
	{
		Scanner read = new Scanner (System.in);
		System.out.print("Enter the no of movies : ");
		int movies = read.nextInt();
		read.nextLine();
		String movieList[][] = new String[movies][];
		//int k[] = new int[movies];


		for(int i=0; i<movies ; i++)
		{
			System.out.print("Enter the no of movies fields for movie "+ i +" : ");
			int k = read.nextInt();
			read.nextLine();
			movieList[i] = new String[k];
			for(int j = 0; j < k; j++)
			{
				movieList [i][j] = read.nextLine();
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
		
		
		read.close();
	}
}