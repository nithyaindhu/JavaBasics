/**
 * 
 */
package com.controlstructure;

/** This class NoOfDays implements an application that prints no of days in a month
 * @author HP
 * @since 29/11/2022
 */
import java.util.Scanner;
public class NoOfDays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner(System.in);
		System.out.print("Enter the month in number : ");
		int month = read.nextInt();
		System.out.print("Enter year : ");
		int year = read.nextInt();
		int days =0;
		String name = "";
		switch(month)
		{
		case 1:
			days = 31;
			name = "January";
			break;
		case 2:
			days = 28;
			name = "February";
			if((year % 4 ==0 && year%100!=0)|| year%400 ==0)
			{
				days = 29;
			}
			break;
		case 3:
			days = 31;
			name = "March";
			break;
		case 4:
			days = 30;
			name = "April";
			break;
		case 5:
			days = 31;
			name = "May";
			break;
		case 6:
			days = 30;
			name = "June";
			break;
		case 7:
			days = 31;
			name = "July";
			break;
		case 8:
			days = 31;
			name = "August";
			break;
		case 9:
			days = 30;
			name = "September";
			break;
		case 10:
			days = 31;
			name = "October";
			break;
		case 11:
			days = 30;
			name = "November";
			break;
		case 12:
			days = 31;
			name = "December";
			break;
		}
		System.out.println( name +" "+year+ " month has " + days + " days !!!");
		read.close();
	}

}
