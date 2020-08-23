package chap01.bassic;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

//01 toán tử số học
public class p03operator {
	public static void main(String[] args) {
//		int numberOne = 20;
//		int numberTwo = 3;
//		int result;
//		//+
//		result = numberOne + numberTwo;
//		System.out.println(result);
//		//-
//		result = numberOne - numberTwo;
//		System.out.println(result);
//		//*
//		result = numberOne * numberTwo;
//		System.out.println(result);
//		//:
//		result = numberOne / numberTwo;
//		System.out.println(result);
//		// %
//		result = numberOne % numberTwo;
//		System.out.println(result);
//	}
//	public static void main01(String[] args) {
//		int number = 20;
//		
//		System.out.println(number);
//		//number = number + 10;
//		//number += 10;
//		number -= 10;
//		number *= 10;
//		number /= 10;
//		
//		System.out.println(number);
			// toán tử ++
//		int numberStart = 20;
//		int numberEnd = 0;
//		numberEnd = ++numberStart;
//		System.out.println(numberStart);
//		System.out.println(numberEnd);
		// toán tử so sánh
//		int numberOne = 2;
//		int numberTwo = 10;
//		boolean result = false;
//		result = numberOne > numberTwo;
//		System.out.println(result);
//		result = numberOne < numberTwo;
//		System.out.println(result);
//		result = numberOne >= numberTwo;
//		System.out.println(result);
//		result = numberOne <= numberTwo;
//		System.out.println(result);
//		result = numberOne == numberTwo;
//		System.out.println(result);
//		result = numberOne != numberTwo;
//		System.out.println(result);
		// toán tử logic || $$
//		int numberOne = 2;
//		int numberTwo = 10;
//		boolean result = false;
//		result = (numberOne > numberTwo)&&(numberOne >= numberTwo);
//		System.out.println("&&" + result);
//		result = (numberOne > numberTwo)||(numberOne >= numberTwo);
//		System.out.println("||" + result);
//		result = !(numberOne > numberTwo);
//		System.out.println("! " + result);
		// TOÁN HỌC  phổ biến
//		int numberOne = 20;
//		int numberTwo = 10;
//		double numberThree = 123.456;
//		
//		int maxresult = Math.max(numberOne, numberTwo);
//		System.out.println("max " + maxresult);
//		int minresult = Math.min(numberOne, numberTwo);
//		System.out.println("min " + minresult);
//		System.out.println("ceit " + Math.ceil(numberThree));
//		System.out.println("floor " + Math.floor(numberThree));
//		System.out.println("round: " + Math.round(numberThree));
//		double randomNumber = Math.random();
//		System.out.println("radom: " + randomNumber);
//		int numberOne = 20;
//		int numberTwo = 10;
//		int numberThree = 40;
//		int result = Math.max(numberOne, numberTwo);
//		int maxNumber = Math.max(result, numberThree);
//		System.out.println(maxNumber);
		int max = 19;
		int min = 14;
		int range = (max - min) + 1;
		int randomNumber = 0;
		randomNumber = (int)(Math.random() * range) + min;
		System.out.println("random " + randomNumber);
	}
}
