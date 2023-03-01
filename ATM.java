/**
 * 
 */
package com.controlstructure;

/**
 * @author HP
 *
 */
import java.util.Scanner;
public class ATM {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner(System.in);
		System.out.println("Enter amount : ");
		int amount = read.nextInt();
		
		if(amount%500 !=0)
		{
			System.out.println("please enter the amount multiple of 500 !!!");
		}
		if(amount/ 2000 !=0)
		{
			System.out.print((amount/2000)+ " notes on 2000, ");
			amount%=2000;
		}
		if(amount/1000 != 0)
		{
			System.out.print((amount/1000)*2 + " notes on 500, ");
			amount%=1000;
		}
		if(amount/500 !=0)
		{
			System.out.print((amount/100) + " notes on 100");
		}
		read.close();
	}

}
