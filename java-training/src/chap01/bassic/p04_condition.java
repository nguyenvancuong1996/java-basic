package chap01.bassic;

public class p04_condition {
	public static void main(String[] args) {
//		int number = 14;
//		String result = "--";
//		int tmp = number % 2;
//		//System.out.println(tmp);
		// điều kiện if
		// c1
//		if(tmp == 0) {
//			System.out.println("số chẵn");
//		}
//		if(tmp == 1) {
//			System.out.println("số lẻ");
//		}
		// c2
//		if(tmp == 0) result = "số chẵn";
//		if(tmp ==1 ) result = "số lẻ";
//		System.out.println(result);
		// if else
//		int number = 14;
//		if(number % 2 == 0) {
//			System.out.println("số chẳn");
//		}else {
//			System.out.println("số lẽ");
//		}
		// if else if else
//		int number = 12;
//		if(number == 0) {
//			System.out.println("số không");
//		}else if(number % 2 == 1) {
//			System.out.println("số lẻ");
//		}else {
//			System.out.println("số chẵn");
//		int number = - 14;
//		String result = "--";
//		if(number >= 0 && number % 2 == 0) {
//			result = "nguyên dương chẵn";
//		}else if(number >= 0 && number % 2 == 1) {
//			result = "nguyên dương lẻ";
//		}else if(number < 0 && number % 2 == 0) {
//			result = "nguyên âm chẵn";
//		}else {
//			result = "nguyên âm lẻ";
//		}
//		System.out.println(result);
		/// Switch
		int number = 1;
		String result = "--";
		switch (number) {
		case 1:
			result = "số 1";
			System.out.println("số 1");
			break;
		case 2:
			result = "số 2";
			System.out.println("số 2");
			break;
		case 3:
			result = "số 3";
			System.out.println("số 3");
			default:
				result = "không hợp lệ";
				System.out.println("mặc định");
		}
	}

}
