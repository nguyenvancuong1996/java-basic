package chap01.bassic;

import java.text.DecimalFormat;
import java.util.Scanner;

public class p09_atm {
	public static void main(String[] args) {
		// 450.000
		// 50.000 = 9
		// 200.000 (2) + 50 (1) = 3
		// 200.000 + 100.000(2) + 50.000 (1) = 4
		// 450.000 % 100.000 = 0

		DecimalFormat formatter = new DecimalFormat("#,###");

		int money = 0;
		final int FIVE_HUNRED_THOUSAND = 500000;
		final int TWO_HUNRED_THOUSAND = 200000;
		final int ONE_HUNRED_THOUSAND = 100000;
		final int FIFTY_THOUSAND = 50000;
		final int TWEENTY_THOUSAND = 20000;
		final int TEN_THOUSAND = 10000;

		int fiveHunredthousand = 0;
		int twoHunredthousand = 0;
		int oneHunredthousand = 0;
		int fiftythousand = 0;
		int tweentythousand = 0;
		int tenthousand = 0;

		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("your money :");
			money = sc.nextInt();
		} while (money % 10000 != 0);
		sc.close();

		System.out.println("------");
		/// 500.000 nghìn đồng
		if (money >= FIVE_HUNRED_THOUSAND) {
			fiveHunredthousand = money / FIVE_HUNRED_THOUSAND;
			money = money % FIVE_HUNRED_THOUSAND;
			System.out.printf("Mệnh giá %s : %d %n", formatter.format(FIVE_HUNRED_THOUSAND), fiveHunredthousand);

		}
		/// 200.000 nghìn đồng
		if (money >= TWO_HUNRED_THOUSAND) {
			twoHunredthousand = money / TWO_HUNRED_THOUSAND;
			money = money % TWO_HUNRED_THOUSAND;
			System.out.printf("Mệnh giá %s : %d %n", formatter.format(TWO_HUNRED_THOUSAND), twoHunredthousand);

		}
		/// 100.000 nghìn đồng
		if (money >= ONE_HUNRED_THOUSAND) {
			oneHunredthousand = money / ONE_HUNRED_THOUSAND;
			money = money % ONE_HUNRED_THOUSAND;
			System.out.printf("Mệnh giá %s : %d %n", formatter.format(ONE_HUNRED_THOUSAND), oneHunredthousand);

		}
		/// 50.000 nghìn đồng
		if (money >= FIFTY_THOUSAND) {
			fiftythousand = money / FIFTY_THOUSAND;
			money = money % FIFTY_THOUSAND;
			System.out.printf("Mệnh giá %s : %d %n", formatter.format(FIFTY_THOUSAND), fiftythousand);

		}
		// 20.000 nghìn đồng
		if (money >= TWEENTY_THOUSAND) {
			tweentythousand = money / TWEENTY_THOUSAND;
			money = money % TWEENTY_THOUSAND;
			System.out.printf("Mệnh giá %s : %d %n ", formatter.format(TWEENTY_THOUSAND), tweentythousand);

		}
		// 10.000 nghìn đồng
		if (money >= TEN_THOUSAND) {
			tenthousand = money / TEN_THOUSAND;
			money = money % TEN_THOUSAND;
			System.out.printf("Mệnh giá %s : %d %n", formatter.format(TEN_THOUSAND), tenthousand);

		}
	}
}
