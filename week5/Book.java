package week5;

public class Book {
	String title,author;

	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	public Book(String title) {
		this.title = title;
		this.author = "�۰��̻�";
	}
	public static void main(String[] args) {
		Book littlePrince = new Book("�����","�������丮");
		Book loveStory = new Book("������");
		
		System.out.println(littlePrince.title + " " + littlePrince.author);
		System.out.println(loveStory.title + " " + loveStory.author);
	}
}
