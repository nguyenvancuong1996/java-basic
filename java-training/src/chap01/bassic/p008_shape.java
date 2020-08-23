package chap01.bassic;

public class p008_shape {
	public static void main(String[] args) {
//		code 1
//		 * 
//		 *  * 
//		 *  *  * 
//		 *  *  *  * 
//		 *  *  *  *  * 
//
//		int number = 1;
//		while (number <= 5) {
//			
//			for(int i = 1; i <= number;i++) {
//				System.out.print(" * ");
//			}
//			System.out.println();
//			number++;
//		}
		// code 2
//		 *  *  *  *  * 
//		 *  *  *  * 
//		 *  *  * 
//		 *  * 
//		 * 
//
//		int number = 5;
//		while (number >= 1) {
//			
//			for(int i = 1; i <= number;i++) {
//				System.out.print(" * ");
//			}
//			System.out.println();
//			number--;
//		 }
//		code 3
//        * 
//      * * 
//    * * * 
//  * * * * 
//* * * * * 
//		int number = 1;
//		while (number <= 5) {
//
//			for (int i = 1; i <= 5 - number; i++) {
//				System.out.print("  ");
//			}
//			for (int j = 1; j <= number; j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//			number++;
//		}
//		code 4
//		* * * * * 
//		  * * * * 
//		    * * * 
//		      * * 
//		        * 
//		int number = 5;
//		while (number >= 1) {
//
//			for (int i = 1; i <= 5 - number; i++) {
//				System.out.print("  ");
//			}
//			for (int j = 1; j <= number; j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//			number--;
//		}		
//		code 5
//		 1
//		 1 2
//		 1 2 3
//		 1 2 3 4
//		 1 2 3 4 5
//		int number = 1;
//		while (number <= 5) {
//			for(int i = 1; i <= number;i++) {
//				System.out.print(" " + i);
//			}
//			System.out.println();
//			number++;
//		}
		/// code 6
//	    1
//	    212
//	   32123
//	  4321234
//	 543212345
//
//		String record = "";
//		String result = "";
//		String space = "";
//		String left = "";
//		String right = "";
//		int number = 1;
//		while(number <= 5) {
//			space = "";
//			left = "";	
//			right = "";
//			for(int s = 1; s <= (5- number) ; s++) space += " ";
//			for(int l = number; l >= 2; l--) left += l;
//			for(int r = 2; r <= number; r++) right += r;
//			
//			record = space + left +"1"+ right + "\n";
//			result = result + record;
//			number++;
//		}
//		System.out.println(result);
		// code 7 ve hinh vuong
//		* * * * * 
//		*       * 
//		*       * 
//		*       * 
//		* * * * * 
//		final int LENGTH = 7;
//		int number = 1;
//		while (number <= LENGTH) {
//			for (int i = 1; i <= LENGTH; i++) {
//				if (i >= 2 && i <= LENGTH - 1 && number >= 2 && number <= LENGTH -1) {
//					System.out.print("  ");
//				} else {
//					System.out.print("* ");
//				}
//			}
//			System.out.println();
//			number++;
//		}
		/*
		 * code 8 HEIGHT 4 line = space + character space = HEIGHT - line character =
		 * 2*line -1
    *
   ***
  *****
 *******
*********
		 
		
		final int HEIGHT = 5;
		int line = 1;
		String result = "";
		String space = "";
		String character = "";
		while (line <= HEIGHT) {
			space = "";
			character = "";
			for (int s = 1; s <= HEIGHT - line; s++)
				space += " ";
			for (int c = 1; c <= 2 * line - 1; c++)
				character += "*";
			result += space + character + "\n";
			line++;
		}
		System.out.println(result);
		*/
	}
}
