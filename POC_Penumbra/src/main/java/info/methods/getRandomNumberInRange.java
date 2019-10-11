package info.methods;

import java.util.Random;


public class getRandomNumberInRange 
{
	private static final String ALPHA_NUMERIC_STRING = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
	
	public static int getRandomNumbernum(int min, int max) {

		if (min >= max) {
			throw new IllegalArgumentException("max must be greater than min");
		}

		Random r = new Random();
		return r.nextInt((max - min) + 1) + min;
	}
	
	
	public static String randomAlphaNumeric(int count) {
	
	StringBuilder builder = new StringBuilder();
	while (count-- != 0) 
	{
		int character = (int)(Math.random()*ALPHA_NUMERIC_STRING.length());
		builder.append(ALPHA_NUMERIC_STRING.charAt(character));
	}
		return builder.toString();
	}
}
