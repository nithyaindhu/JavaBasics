/**
 * 
 */
package com.controlstructure;

/** this class BabyLion implements an application that find baby lion is well behaved or not
 * @author HP
 *
 */
import java.util.Scanner;
public class BabyLion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner(System.in);
		System.out.print("Enter rabbit count : ");
		int rabbit = read.nextInt();
		System.out.print("Enter squirrel count : ");
		int squirrel = read.nextInt();
		System.out.print("Enter bird count : ");
		int bird = read.nextInt();
		System.out.print("Enter deer count : ");
		int deer = read.nextInt();
		System.out.print("Enter total count : ");
		int total = read.nextInt();
		
		if(total == (rabbit+squirrel+bird+deer))
		{
			System.out.println("baby lion is well behaved");
		}
		else if (total >(rabbit+squirrel+bird+deer))
		{
			System.out.println("baby lion is mischevious");
		}
		else
		{
			System.out.println("Counted wrongly");
		}
		read.close();		
	}
}
