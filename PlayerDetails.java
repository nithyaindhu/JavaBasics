/** 
 * program to declare a variable as playerName, playerAge, playerHeight, 
 * playerWeight, playerRank, playerMobileNumber
 * assign values and print it
 * @author Nithya M (Jamocha)
 * @version 1.0
 * @since 23/11/2022
 */
package com.sequence;
class PlayerDetails
{
	public static void main(String args[])
	{
		String playerName = "Nithya";
		byte playerAge = 24, playerRank = 1;
		double playerHeight = 150.5d, playerWeight = 60.6d;
		String playerMobileNumber = "9659863303";
		
		System.out.println("Player Name : " +playerName 
		+ "\nPlayer Age : " + playerAge 
		+ "\nPlayer Height : "+ playerHeight 
		+ "\nPlayer Weight : " + playerWeight 
		+ "\nPlayer Rank : " + playerRank 
		+ "\nPlayer Contact Number : " + playerMobileNumber);
	}
}