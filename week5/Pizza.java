package week5;
class Circle{
	int radius;
	String name;
	// method overloading 매개변수의 타입, 개수 ,위치  시그니처
	public Circle() { //생성자는 첫글자가 대문자
		//기본 생성자
	}
	public Circle(int radius) {
		this.radius = radius;
	}
	public Circle(int radius, String name) {
		this(radius); //다른 생성자를 호출 할때 
		this.name = name;
	}
	double getArea(int radius) {
		double area = 3.14 * radius * radius;
		return area;
	}
}
public class Pizza {
	public static void main(String[] args) {
		Circle pizza = new Circle(5,"자바피자"); //Circle은 클래스 이름  new다음 Circle은 생성자
		//pizza.radius = 5;
		//pizza.name = "자바피자";
		System.out.println(pizza.name + "의 면적은 " + pizza.getArea(pizza.radius));
		
		Circle donut = new Circle(2,"자바도넛");
		//donut.radius = 2;
		//donut.name = "자바도넛";
		System.out.println(donut.name + "의 면적은 " + donut.getArea(donut.radius));
	}
}
