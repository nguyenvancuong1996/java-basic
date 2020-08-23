package chap02.oop;

import java.util.Calendar;
// chong ke thua final. tu khoa extenl ke thua
	public class Person {
	public String name;
	public String code;
	public int Brithday;
	
	// constructor
//	public Person(String vname, String vcode, int vbithday) {
//		super();
//		this.name = vname;
//		this.code = vcode;
//		this.Brithday = vbithday;
//	}
	// setter
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public int getBrithday() {
		return Brithday;
	}
	public void setBrithday(int brithday) {
		Brithday = brithday;
	}
	public int getAge() {
		int age = 0;
		Calendar now = Calendar.getInstance();
		System.out.println();
		age = now.get(Calendar.YEAR) - this.getBrithday();
		return age;
	}
	// show Person info
	public void ShowInfor() {
		System.out.println("-------------");
		System.out.println("/t Show Infor");
		System.out.println("- Name \t\t :"+ this.name);
		System.out.println("- ma sv \t :" + this.code);
		System.out.println("- Brithday \t:" + this.Brithday);
		System.out.println("Age \t :" + this.getAge());
	}
}
