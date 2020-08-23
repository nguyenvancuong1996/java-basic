package chap01.bassic;

import java.util.Scanner;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

public class ptb2 {
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("nhap so a :  ");
		float a = ptb2.scanner.nextFloat();
		System.out.print("nhap so b : ");
		float b = ptb2.scanner.nextFloat();
		System.out.print("nhap so c : ");
		float c = ptb2.scanner.nextFloat();

		if (a == 0) {

			if (b == 0) {
				System.out.println("phuong trinh vo nghiem ");
			} else {
				System.out.println("pt co nghiem phan biet : " + "x = " + (-c / b));
			}
			return;
		}
		float detal = b * b - 4 * (a * c);
		float x1;
		float x2;
		if (detal > 0) {
			x1 = (float) ((-b + Math.sqrt(detal)) / (2 * a));
			x2 = (float) ((-b - Math.sqrt(detal)) / (2 * a));
			System.out.println("nghiem 1 : " + x1 + " nghiem 2: " + x2);
		}else if(detal == 0) {
			x1 =(-b / (2 * a));
			System.out.println(" 1 nghiem : " + x1);
		}else {
			System.out.println(" phuong trinh vo nghiem");
		}
	}
}
