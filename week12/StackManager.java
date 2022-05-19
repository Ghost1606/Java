package week12;

public class StackManager {
	public static void main(String[] args) {
		StringStack  s = new StringStack(10);
		s.push("Apple");
		s.push("Orange");
		s.push("Blueberry");
		s.print();
		System.out.println("==================");
		s.pop();
		s.print();
		System.out.println("==================");
	}
}
