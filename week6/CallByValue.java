package week6;

public class CallByValue {

	public static void main(String[] args) {
		int n = 10;
		increase(n);
		System.out.println(n);
	}
	static void increase(int m) {
		m++;
		System.out.println(m); // 실행이 끝난 후 메모리에서 날아감
	}

}
