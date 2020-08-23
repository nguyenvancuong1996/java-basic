package chap02.oop;

import java.util.Calendar;

public class Teacher extends Person {
	public String name;
	public String code;
	public int Brithday;
	public double salary;

	// constructor

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
}
