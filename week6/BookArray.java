package week6;

import java.util.Scanner;

class Book{
	String tittle, author;
	public Book(String tittle, String author) {
		this.tittle = tittle;
		this.author = author;
	}
}

public class BookArray {

	public static void main(String[] args) {
		Book [] book = new Book[2];
		
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < book.length; i++) {
			System.out.print("제목>>");
			String tittle = sc.next();
			System.out.print("저자>>");
			String aString = sc.next();
			book[i] = new Book(tittle,aString);
		}
		for (int i = 0; i < book.length; i++) {
			System.out.print("(" + book[i].tittle + ", " + book[i].author + ")");
			
			sc.close();
		}
	}

}
