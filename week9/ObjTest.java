package week9;

class D{
	int a,b,c;
	String name;
	
	public D(){}
	public D(int a) {
		this.a = a;
	}
	public D(int a, int b) {
		this(a); //내 안에 생성자 호출
//		this.a = a;
		this.b = b;
	}
	public D(int a, int b, int c) {
		this(a,b); //두개 있는 거 호출
		this.c = c;
	}
	public D(int a, int b, String name) {
		this(a,b);
		this.name = name;
	}
	/*public D(){ //기본 생성자로 생성 되있음(default)
		super(); //Object class 호출(부모 호출)
	}*/

	//생성자 오버로딩, 생성자는 클래스명과 같고, 여러개 생성 할 수 있다. 생성자도 메소드 일종,시그니처가 달라야함
//	public D() {	} //데이터 타입,개수,순서 다르면 허용
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
	//인자가 달라야 함
	int sum() { return a+b; }
	int sum(int c) { return c+b; }
	int sum(int c, int d) { return c+d; }
	
	void print() {
		System.out.println("D클래스의 객체");
	}
}

public class ObjTest {
	public static void main(String[] args) {
		D d = new D(1, 2, "홍길동"); //객체 만들때 초기화 할 수 있다.
		System.out.println("a = " + d.a + " b = " + d.b + " name = "+ d.name);
		System.out.println(d.sum()); //1+2
		System.out.println(d.sum(5)); // 5+2
		System.out.println(d.sum(6,4)); //6+4
	}
}
