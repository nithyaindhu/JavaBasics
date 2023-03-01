/** 
 * program to declare a variable as highestAge in int and assign it to byte variable
 * @author Nithya M (Jamocha)
 * @version 1.0
 * @since 23/11/2022
 */
package com.sequence;
class IntToByte1
{
	public static void main(String ar[])
	{
		int highestAge = 130;
		byte byteAge = (byte)highestAge; //throws error
		System.out.println(byteAge);
	}
}
