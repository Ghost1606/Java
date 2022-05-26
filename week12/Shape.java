package week12;

public abstract class Shape {
	public String name;
	public Shape next;//�ڱ� ���� , �ּ�
	public Shape() {
		next = null;
	}
	public Shape getNext() {
		return next;
	}
	public void setNext(Shape next) {
		this.next = next;
	}
	public abstract void draw(); //�߻� �޼ҵ�
}