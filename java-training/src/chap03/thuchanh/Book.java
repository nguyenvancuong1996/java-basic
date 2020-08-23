package chap03.thuchanh;

public class Book {
	private String namebook;
	private String id;
	private double money;
	
	public Book(String id, String namebook, double money) {
		this.setId(id);
		this.setNamebook(namebook);
		this.setMoney(money);
	}
	public void ShowInfor(){
		System.out.println("\t Book Store");
		System.out.println("Name Book :"+ this.getNamebook());
		System.out.println("ID :"+ this.getId());
		System.out.println("Money :" + this.getMoney());
	}

	public String getNamebook() {
		return namebook;
	}

	public void setNamebook(String namebook) {
		this.namebook = namebook;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}
}
	