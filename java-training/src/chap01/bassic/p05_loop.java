package chap01.bassic;

public class p05_loop {
	public static void main(String[] args) {
		// vòng lặp For
//		for (int i = 0; i < 10; i++) {
//			System.out.println( i + " - Java is not difficult !!");
//		}
//		// while
//		int j = 1;
//		while(j < 10) {
//			System.out.println(j + " - Java");
//			j = j + 2;
//		}
//		// do while
//		int k = 5;
//		do {
//			System.out.println(k + " Java 2 ");
//			k++;
//		}while(k < 5);
		// bảng nhân 3
//		int number = 3;
//		int h = 1;
//		
//		while( h <= 10) {
//			int c;
//			c = number * h;
//			System.out.printf("%d x %d = %d %n", number, h , c );
//			h++;
//		}
//		int o = 4;
//		int m = 1;
//		for(int l = 1; l <= 10; l++) {
//			m = o * l;
//			//System.out.println("4 * " + l + " = " + m);
//			System.out.printf("%d x %d = %d %n", o, l , m );
//		}
//		int f = 1;
//		int v = 5;
//		do {
//			int g;
//			g = f * v;
//			System.out.printf("%d x %d = %d %n", v, f , g );
//			f++;
//		}while(f <= 10);
//		for (int i = 2; i <= 9; i++) {
//			System.out.println("bảng cửa chương :" + i);
//			int number = i;
//			for (int j = 1; j <= 10; j++)
//				System.out.printf("%d x %d = %d %n", number, j, number * j);
//		}
//		System.out.println();
		for(int i = 1;i <= 20; i++) {
			if(i % 7 == 0) {
				System.out.println("ok " + i);
				//continue;
				//break;
			}
			System.out.println(i);
		}
	}
}