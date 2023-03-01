/** writing a program to store an info for mobile shop
 * mobileBrand
 * mobieName
 * mobileRam
 * mobileBattery
 * mobileStorage
 * mobileCameraPixelsFront
 * mobileCameraPixelBack
 * mobileProcessor
 * mobileAudioJack  // yes /no
 * mobileSimSlots
 * mobileMemoryCardSlot
 * mobileChargeType
 * mobileSize
 * mobileNetworkType
 * @author Nithya M (Jamocha)
 * @version 1.0
 * @since 23/11/2022
 */
package com.sequence;
class MobileShop
{
	public static void main(String args[])
	{
		String mobileBrand = "MI MAX 2";
		String mobileName = "chintu";
		byte mobileRamInGb = 4;
		int mobileBatteryInMah = 5200;
		int mobileStorageInGb = 64;
		byte mobileCameraPixelFrontInMp = 34;
		byte mobileCameraPixelBackInMp = 60;
		String mobileProcessor = "snap dragon";
		boolean mobileAudioJack = true;
		byte mobileSimSlots = 2;
		boolean mobileMemoryCardSlot = true;
		String mobileChargerType = "Type C";
		double mobileScreenSizeInInch = 6.5;
		double mobileHeightInCm = 15;
		double mobileBreathInCm = 7;
		double mobileWeightInKg = 0.750;
		String mobileNetworkType = "4G";

		System.out.println("Mobile Brand : " + mobileBrand);
		System.out.println("Mobile Name : " + mobileName);
		System.out.println("Mobile RAM in Gb : " + mobileRamInGb);
		System.out.println("Mobile Battery in Mah : " + mobileBatteryInMah);
		System.out.println("Mobile Storage In GB : " + mobileStorageInGb);
		System.out.println("Mobile Front Camera Pixel In MP : " + mobileCameraPixelFrontInMp);
		System.out.println("Mobile Back Camera Pixel In MP : " + mobileCameraPixelBackInMp);
		System.out.println("Mobile Processor : " + mobileProcessor);
		System.out.println("Mobile Audio Jack : " + mobileAudioJack);
		System.out.println("Mobile Sim Slots : " + mobileSimSlots);
		System.out.println("Mobile Memory Card Slot : " + mobileMemoryCardSlot);
		System.out.println("Mobile Charger Type : " + mobileChargerType);
		System.out.println("Mobile Screen Size in Inch : " + mobileScreenSizeInInch);
		System.out.println("Mobile Height in CM : " + mobileHeightInCm);
		System.out.println("Mobile Breath in CM : " + mobileBreathInCm);
		System.out.println("Mobile Weight in KG : " + mobileWeightInKg);
		System.out.println("Mobile Network Type : " + mobileNetworkType);
	}
}

