/**
 * 
 */
package com.controlstructure;

/**This class CurrencyInIndia implements an application that asks question
 * @author HP
 * @since 29/11/2022
 */
import java.util.Scanner;
public class CurrencyInIndia {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner (System.in);
		System.out.println("What is the unit of currency in india?");
		String answer;
		int count =1;
		do
		{
			answer = read.nextLine();
			if(answer.equalsIgnoreCase("Rupee") && count<=3)
			{
				System.out.println("Correct answer !!!");
			}
			count++;
			if(count ==4)
			{
				System.out.println("sorry it is Rupee!!!");
			}
			else
			{
				System.out.println("try again!!!");
			}
		}while(answer.equalsIgnoreCase("Rupee") || count<=3);
		read.close();
	}

}
