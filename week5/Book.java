package week5;

public class Book {
	String title,author;

	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	public Book(String title) {
		this.title = title;
		this.author = "작가미상";
	}
	public static void main(String[] args) {
		Book littlePrince = new Book("어린왕자","생텍쥐페리");
		Book loveStory = new Book("춘향전");
		
		System.out.println(littlePrince.title + " " + littlePrince.author);
		System.out.println(loveStory.title + " " + loveStory.author);
	}
}
