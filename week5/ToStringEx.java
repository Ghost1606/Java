package week5;

public class ToStringEx {
	int a,b,c;

	public ToStringEx(int a, int b, int c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	@Override //상속 받은걸 재정의 함
	public String toString() {
		return "ToStringEx [a=" + a + ", b=" + b + ", c=" + c + "]";
	}

	public static void main(String[] args) {
		ToStringEx t = new ToStringEx(1, 2, 3);
		System.out.println(t);
		//t.toString(); //위 출력문과 비슷하게 출력 됨
	}
}
