package edu.scut.ibm.slpa.common;

import java.util.Random;

public class RandomNumGenerator {
	private static Random random = new Random();
	
	public static int getRandomInt(int max) {
		return random.nextInt(max);
	}
}
