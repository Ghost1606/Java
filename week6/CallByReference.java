package week6;

public class CallByReference {

	public static void main(String[] args) {
		Circle pizza = new Circle(10);
		System.out.println(pizza.radius);
		increase(pizza);
		
		System.out.println(pizza.radius);
	}
	static void increase(Circle m) {
		m.radius++;
	}

}
