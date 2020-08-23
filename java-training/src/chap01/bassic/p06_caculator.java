package chap01.bassic;

import java.util.Scanner;

public class p06_caculator {
	public static void main(String[] args) {
		int numberfirst;
		int numbersecond;
		int result = 0;
		String caculate;
		Scanner sc = new Scanner(System.in);
		System.out.println("number first :");
		numberfirst = sc.nextInt();
		sc.nextLine();

		System.out.println("numbersecond :");
		numbersecond = sc.nextInt();
		sc.nextLine();

		System.out.println("caculate :");
		caculate = sc.nextLine();

		sc.close();
		System.out.println("numberfirst :" + numberfirst);
		System.out.println("numbersecond :" + numbersecond);
		System.out.println("caculator :" + caculate);
		switch (caculate) {
		case "+" :
			result = numberfirst + numbersecond;			
			break;
		case "-" :
			result = numberfirst - numbersecond;			
			break;
		case "*" :
		case "x" :
			result = numberfirst * numbersecond;			
			break;
		case "/" :
		case ":" :
			result = numberfirst / numbersecond;			
			break;
		case "%" :
			result = numberfirst % numbersecond;			
			break;

		default:
			result = numberfirst + numbersecond;
			caculate = "+";
			break;
		}
		System.out.println("---------");
		System.out.printf("%d %s %d = %d" , numberfirst, caculate, numbersecond, result);
	}
}
