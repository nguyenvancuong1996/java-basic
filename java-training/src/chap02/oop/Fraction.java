package chap02.oop;

public class Fraction {
	private int numerator;
	private int demoninator;

	public Fraction(int numerator, int demoninator) {
		this.numerator = numerator;
		this.demoninator = demoninator;
	}

	public Fraction(Fraction fractionA, Fraction fractionB, String operator) {
		fractionA.normalize();
		fractionB.normalize();
		switch (operator) {
		case "+":
			this.add(fractionA, fractionB);
			break;
		case "-":
			this.sub(fractionA, fractionB);
			break;
		case "*":
		case "x":
		case "X":
		case ".":
			this.multiply(fractionA, fractionB);
			break;
		case "/":
		case ":":
			this.divide(fractionA, fractionB);
			break;

		default:
			this.add(fractionA, fractionB);
			break;
		}
	}

	// hien thi phan so
	public String print() {
		return this.getNumerator() + "/" + this.getDemoninator();
	}

	// tong 2 phan x/y +  a/b = (x*b + a*y)/(y*b)
	private void add(Fraction fractionA, Fraction fractionB) {
		this.setNumerator(fractionA.getNumerator() * fractionB.getDemoninator()
				+ fractionA.getDemoninator() * fractionB.getNumerator());
		this.setDemoninator(fractionA.getDemoninator() * fractionB.getDemoninator());
		this.normalize();
	}

	// hieu 2 phan so x/y -a/ b = (x*b - a*y)/(y*b)
	private void sub(Fraction fractionA, Fraction fractionB) {
		this.setNumerator(fractionA.getNumerator() * fractionB.getDemoninator()
				- fractionB.getNumerator() * fractionA.getDemoninator());
		this.setDemoninator(fractionA.getDemoninator() * fractionB.getDemoninator());
		this.normalize();
	}

	// tinh 2 phan so x/y * a/b = (x*a)/(y*b)
	private void multiply(Fraction fractionA, Fraction fractionB) {
		this.setNumerator(fractionA.getNumerator() * fractionB.getNumerator());
		this.setDemoninator(fractionA.getDemoninator() / fractionB.getDemoninator());
		this.normalize();
	}

	// thuong 2 so x/y : a/b = (x*b)/(y*a)
	private void divide(Fraction fractionA, Fraction fractionB) {
		this.setNumerator(fractionA.getNumerator() * fractionB.getDemoninator());
		this.setDemoninator(fractionA.getDemoninator() * fractionB.getNumerator());
		this.normalize();
	}

	// tim UCLN
	private int UCLN(int x, int y) {
		int ucln = Math.min(x, y);
		while (ucln >= 1) {
			if (x % ucln == 0 && y % ucln == 0)
				return ucln;
			ucln--;
		}
		return ucln;
	}

	// kiem tra phân số tối giản
	public boolean checkNormalize() {
		if (this.UCLN(this.getNumerator(), this.getDemoninator()) == 1)
			return true;
		return false;
	}

	// rut gon phan so tối giản phân số
	public void normalize() {
		int ucln = this.UCLN(this.getNumerator(), this.getDemoninator());
		this.setNumerator(this.getNumerator() / ucln);
		this.setDemoninator(this.getDemoninator() / ucln);
	}

	public int getNumerator() {

		return numerator;
	}

	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}

	public int getDemoninator() {
		return demoninator;
	}

	public void setDemoninator(int demoninator) {
		this.demoninator = demoninator;
	}

}
