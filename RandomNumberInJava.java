package mypack;

import java.util.Random;

public class RandomNumberInJava {

	public static void main(String[] args) {
		
		Random rand = new Random();

		System.out.println("Random no is "+ (int)Math.floor(100*rand.nextDouble()));
		int num = (int) Math.floor(100*rand.nextDouble());
		System.out.println("Truncated random number is "+num);
	}

}
