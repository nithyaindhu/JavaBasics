/**
 * 
 */
package com.functions;

/** this class HighestPlacement implements the application which prints the department which
 * has highest placement
 * @author HP
 * @since 28/11/2022
 */

import java.util.Scanner;
public class HighestPlacement {

	/**
	 * @param args
	 */
	public static void checkHighest(int cs, int ec, int me)
	{
		if(cs > ec && cs > me)
		{
			System.out.println("Highest placement CS");
		}
		else if(ec > cs && ec > me)
		{
			System.out.println("Highest placement EC");
		}
		else if(me > cs && me > ec)
		{
			System.out.println("Highest placement ME");
		}
		else if(cs == ec  && cs != me)
		{
			System.out.println("Highest placement CS EC");
		}
		else if( cs == me && cs != ec)
		{
			System.out.println("Highest placement CS ME");
		}
		else if(ec == me && ec !=cs)
		{
			System.out.println("Highest placement EC ME");
		}
		else
		{
			System.out.println("Highest placement CS EC ME");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner (System.in);
		System.out.println("Enter the no of students placed in CS : ");
		int cs = read.nextInt();
		System.out.println("Enter the no of students placed in EC : ");
		int ec = read.nextInt();
		System.out.println("Enter the no of students placed in CS : ");
		int me = read.nextInt();
		
		if( cs==0  && ec ==0 && me ==0)
		{
			System.out.println("None of the department has got the highest placement");
		}
		else if( cs<0  || ec <0 || me <0)
		{
			System.out.println("Invalid input !!!");
		}
		else
		{
			checkHighest(cs,ec,me);
		}
		read.close();
	}

}
