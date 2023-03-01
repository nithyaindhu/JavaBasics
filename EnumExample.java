/** this class EnumExample implements a application that will print show the implementation
 * of enum
 *@author Nithya M (Jamocha)
 *@version 1.0
 *@since 25/11/2022
 */
package com.enum1;
import java.util.*;

enum Days
	{
		SUNDAY(1),MONDAY(2),TUESDAY(3),WEDNESDAY(4),THURSDAY(5),FRIDAY(6),SATURDAY(7);
		private int daysValue;
		private Days(int daysValue)
		{
			this.daysValue = daysValue;
		}
		int getDaysValue()
		{
			return daysValue;
		}
	}
class EnumExample
{
	static void switchDays(Days days)
	{
		switch(days)
		{
			case SUNDAY:
				System.out.println(days.ordinal() + " " +days.getDaysValue());
				break;
			case MONDAY:
				System.out.println(days.ordinal() + " " +days.getDaysValue());
				break;
			case TUESDAY:
				System.out.println(days.ordinal() + " " +days.getDaysValue());
				break;
			case WEDNESDAY:
				System.out.println(days.ordinal() + " " +days.getDaysValue());
				break;
			case THURSDAY:
				System.out.println(days.ordinal() + " " +days.getDaysValue());
				break;
			case FRIDAY:
				System.out.println(days.ordinal() + " " +days.getDaysValue());
				break;
			case SATURDAY:
				System.out.println(days.ordinal() + " " +days.getDaysValue());
				break;
		}
	}
			
	public static void main(String args[])
	{
		Scanner read = new Scanner (System.in);
		Days days = Days.SUNDAY;
		System.out.println(days.ordinal() + " " + Days.values());
		
		for ( Days day : Days.values())
		{
			System.out.println(day);
		}
		
		String s = read.nextLine();
		if( Days.valueOf(s).equals(Days.SUNDAY))
		{
			System.out.println(Days.SUNDAY);
		}
		switchDays(Days.MONDAY);
		read.close();
	}
}