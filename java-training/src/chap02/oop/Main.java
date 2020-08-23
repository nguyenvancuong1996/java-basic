package chap02.oop;


public class Main {

	public static void main(String[] args) {
//		Person PersonObj = new Person();
//		// PersonObj.ShowInfor();
//		
//		Student StudentObj = new Student();
//		StudentObj.setName("Beter");
//		StudentObj.setCode("sv0022");
//		StudentObj.setBrithday(1995);
//		StudentObj.setSorce(6.5);
//		StudentObj.ShowInfor();
//		
//		Teacher TeacherObj = new Teacher();
//		TeacherObj.setName("Mai");
//		TeacherObj.ShowInfor();
//		System.out.println("Main.main()");
//		Student StudentOne = new Student("bett", "sv003", 2000);
//		Teacher TeacherOne = new Teacher("Mr Mai", "T00", 1995);
//		Student studentTow = new Student();
//		// 1
//		StudentOne.setBrithday(1994);
//		StudentOne.setCode("S001");
//		StudentOne.setName("Join");
//		StudentOne.ShowInfor();
//		TeacherOne.ShowInfor();
//		// 2
//		studentTow.setBrithday(1996);
//		studentTow.setCode("S002");
//		studentTow.setName("Tommy");
//		studentTow.ShowInfor();
//		
		Fraction fractionA = new Fraction(2, 3);
		Fraction fractionB = new Fraction(1, 2);
		Fraction fractionC = new Fraction(fractionA, fractionB, "x");
	 	System.out.printf("%s + %s = %s",fractionA.print(),fractionB.print(),fractionC.print());
		//System.out.println(fractionA.print());
		//fractionA.normalize();
		//System.out.println(fractionA.print());
		
	}
}