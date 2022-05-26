package week9;

class D{
	int a,b,c;
	String name;
	
	public D(){}
	public D(int a) {
		this.a = a;
	}
	public D(int a, int b) {
		this(a); //�� �ȿ� ������ ȣ��
//		this.a = a;
		this.b = b;
	}
	public D(int a, int b, int c) {
		this(a,b); //�ΰ� �ִ� �� ȣ��
		this.c = c;
	}
	public D(int a, int b, String name) {
		this(a,b);
		this.name = name;
	}
	/*public D(){ //�⺻ �����ڷ� ���� ������(default)
		super(); //Object class ȣ��(�θ� ȣ��)
	}*/

	//������ �����ε�, �����ڴ� Ŭ�������� ����, ������ ���� �� �� �ִ�. �����ڵ� �޼ҵ� ����,�ñ״�ó�� �޶����
//	public D() {	} //������ Ÿ��,����,���� �ٸ��� ���
//
//	public D(int a) {this.a = a;}
//
//	public D(int a, int b) {this.a = a;		this.b = b;}
//
//	public D(int a, int b, String name) {
//		this.a = a;
//		this.b = b;
//		this.name = name;
//	}
	//���ڰ� �޶�� ��
	int sum() { return a+b; }
	int sum(int c) { return c+b; }
	int sum(int c, int d) { return c+d; }
	
	void print() {
		System.out.println("DŬ������ ��ü");
	}
}

public class ObjTest {
	public static void main(String[] args) {
		D d = new D(1, 2, "ȫ�浿"); //��ü ���鶧 �ʱ�ȭ �� �� �ִ�.
		System.out.println("a = " + d.a + " b = " + d.b + " name = "+ d.name);
		System.out.println(d.sum()); //1+2
		System.out.println(d.sum(5)); // 5+2
		System.out.println(d.sum(6,4)); //6+4
	}
}