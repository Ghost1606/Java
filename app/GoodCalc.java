package app;
import lib.Calculator; //lib.*을 사용해도 무관하다

public class GoodCalc extends Calculator{

	public int add(int a, int b) {
		return a + b;
	}

	public int subtract(int a, int b) {
		return a - b;
	}

	public double average(int[] a) {
		double sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		return sum/a.length;
	}
	public static void main(String[] args) {
		Calculator c = new GoodCalc();
		System.out.println(c.add(1, 2));
		System.out.println(c.subtract(6, 1));
		System.out.println(c.average(new int [] { 1,2,3,4,5 })); //무명배열
	}
}
