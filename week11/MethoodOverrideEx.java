package week11;

//class Shape{
//	public void draw() {
//		System.out.println();
//	}
//}

abstract class Shape{
	public abstract void draw();
	public void abc() {
		System.out.println("Shape");
	}
}
class Line extends Shape{
	public void draw() {
		System.out.println("Line");
	}
}
class Rect extends Shape{
	public void draw() {
		System.out.println("Rectangle");
	}
}
class Circle extends Shape{
	public void draw() {
		System.out.println("Circle");
	}
}
public class MethoodOverrideEx {
	static void paint(Shape p) {
		p.draw();
	}
//	static int calc(int a, int b) {
//		return a + b;
//	}
	public static void main(String[] args) {
		//Line line = new Line();
		Rect rect = new Rect();
		paint(rect);
		
//		Shape p = new Line();
		
//		calc(1,2);
		
		//다음에 사용 안 할 거면 밑에 처럼 정의 한다
		//paint(new Shape());
		paint(new Line());
		paint(new Rect());
		paint(new Circle());
	}
}
