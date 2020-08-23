package chap01.bassic;

import java.util.Scanner;

public class p07_find {
	public static void main(String[] args) {
		final int MAX_NUMBER = 100;
		final int MIN_NUMBER = 1;
		int range = (MAX_NUMBER - MIN_NUMBER) + 1;
		int secretNumber = (int) (Math.random() * range) + MIN_NUMBER;
		
		Scanner sc = new Scanner(System.in);
		
		int yourNumber = 0;
		int score = 0;
		while (secretNumber != yourNumber) {
			System.out.println("your Number 1-100 : ");
			yourNumber = sc.nextInt();
			if (yourNumber > secretNumber) {
				System.out.println("Greater than !!	");
			} else if (yourNumber < secretNumber) {
				System.out.println("Less than !!! ");
			} else {
				System.out.println("successfull");
			}
			score++;
		}

		sc.close();
		System.out.println("Score :" + score);
	}
}
