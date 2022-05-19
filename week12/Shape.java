package week12;

public abstract class Shape {
	public String name;
	public Shape next;//자기 참조 , 주소
	public Shape() {
		next = null;
	}
	public Shape getNext() {
		return next;
	}
	public void setNext(Shape next) {
		this.next = next;
	}
	public abstract void draw(); //추상 메소드
}