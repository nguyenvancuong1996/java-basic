package chap02.oop;

import java.util.Calendar;

public class Student extends Person {
	public double sorce;
	// constructor
	// setter
	
	public double getSorce() {
		return sorce;
	}
	public void setSorce(double sorce) {
		this.sorce = sorce;
	}
	public void ShowInfor() {
		super.ShowInfor();
		System.out.println("corce \t:" + this.sorce);
	}
}
