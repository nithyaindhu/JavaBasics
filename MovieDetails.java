/** this class MovieDetails implements a application that will allow user
 *to multiple values of same datatype
 *@author Nithya M (Jamocha)
 *@version 1.0
 *@since 25/11/2022
 */
package com.movies;
import java.util.*;

class MovieDetails
{
	public static void main(String args[])
	{
		Scanner read = new Scanner (System.in);
		int ind=0;
		String array[] = {"Movie Name", "Director Name", "Producer Name", "Hero", "Heroin", "Music Director"};
		for (String i : array)
		{
			System.out.println(ind++ + " " +i);
		}
		read.close();
	}
}