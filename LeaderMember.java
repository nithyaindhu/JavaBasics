/**
 * 
 */
package com.controlstructure;

/**THis class LeaderMember implements an application the finds leader and member
 * @author HP
 * @since 29/11/2022
 */

import java.util.Scanner;
public class LeaderMember {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner(System.in);
		System.out.println("Enter the ticket number : ");
		int ticketNumber = read.nextInt();
		
		if(ticketNumber % 10 ==0)
		{
			System.out.println("Team Leader !!!");
		}
		else
		{
			System.out.println("Team Member !!!");
		}
		read.close();
	}

}
