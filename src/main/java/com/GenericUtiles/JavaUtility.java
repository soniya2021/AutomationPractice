package com.GenericUtiles;

import java.util.Date;
import java.util.Random;

public class JavaUtility {
	public static String getCurrentDate() {
		Date date = new Date();
		String currentdate = date.toString().replace(" ","_ ").replace(":","_");
		return currentdate;
	}
	public static String getRandomData() {
		Random random = new Random();
		int ran=random.nextInt(1000);
		return ""+ran;
	}
}
