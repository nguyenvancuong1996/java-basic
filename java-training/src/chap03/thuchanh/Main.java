package chap03.thuchanh;

import java.util.Scanner;

public class Main {
	private static Book bookObj = null;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int funtionID = 0;
		boolean flag = true;
		do {
			ShowMenu();
			funtionID = scanner.nextInt();
			scanner.nextLine();
			switch (funtionID) {
			case 1:
				addBook();
				break;
			case 2:
				editBook();
				break;
			case 3:
				inforBook();
				break;
			case 4:
				break;

			default:
				flag = false;
				break;
			}
//			System.out.println(funtionID);
//			if (funtionID == 4)
//				flag = false;
		} while (flag == true);
		scanner.close();
	}

	public static void ShowMenu() {
		System.out.println("============ Book Manager ===========");
		System.out.println("1. Create Book  ");
		System.out.println("2. Edit Book ");
		System.out.println("3. Infor Book ");
		System.out.println("4. Exit");
		System.out.println("Choise [1 - 4] :");
	}

	public static void addBook() {
		Scanner sc = new Scanner(System.in);
		String bookName = "";
		String bookID = "";
		double money = 0;
		System.out.println("ID :");
		bookID = sc.nextLine();
		System.out.println("Book Name :");
		bookName = sc.nextLine();
		System.out.println("money Book: ");
		money = sc.nextDouble();
		bookObj = new Book(bookID, bookName, money);
		// bookObj.ShowInfor();
	}

	public static void editBook() {
		if (bookObj != null) {
			Scanner sc = new Scanner(System.in);
			String bookName = "";
			double moneynew = 0;
			System.out.println("Name new");
			bookName = sc.nextLine();
			System.out.println("Money new");
			moneynew = sc.nextDouble();
			bookObj.setNamebook(bookName);
			bookObj.setMoney(moneynew);
		} else {
			System.out.println("chua nhap !!");
		}
	}

	public static void inforBook() {
		if (bookObj != null) {
			bookObj.ShowInfor();
		} else {
			System.out.println("chua nhap !!");
		}
	}
}
