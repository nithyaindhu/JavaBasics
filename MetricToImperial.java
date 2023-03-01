/** this class MetricToImperial implements application 
 *to convert metric length to its imperial equivalent. (30centimeter = 1foot)
 *@author Nithya M (Jamocha)
 *@version 1.0
 *@since 24/11/2022
 */
package com.sequence;
import java.util.Scanner;

class MetricToImperial
{
	public static void main(String args[])
	{
		Scanner read = new Scanner (System.in);
		int metricLength = read.nextInt();
		System.out.println((int)(metricLength/30) + "feet");
		read.close();
	}
}

		