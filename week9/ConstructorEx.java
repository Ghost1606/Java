package week9;

class A {
	public A() {
		System.out.println("Constructor A");
	}
	public A(int a) {
		System.out.println("Constructor Aa");
	}
}
class B extends A {
	public B() {
		System.out.println("Constructor B");
	}
	public B(int b) {
		super(3);
		System.out.println("Constructor Bb");
	}
}
class C extends B {
	public C() {
		System.out.println("Constructor C");
	}
	public C(int c) {
		super(2); //�θ� ������ ���� ������ ����Ʈ ȣ���
		System.out.println("Constructor Cc");
	}
}
public class ConstructorEx {

	public static void main(String[] args) {
		C c= new C(); // Ŭ���� �̸� ���۷��� �̸� = ��ü���� ������();
		C cc= new C(1);
	}

}