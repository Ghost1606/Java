package week9;

public class CastTest {

	public static void main(String[] args) {
		byte b = 1; int i = 6;
		i = b; //왼쪽 큰 것 오른쪽 작은 것
//		b = i; //오른쪽 작은 것 왼쪽 큰 것 안됨
		b = (byte) i; // 정보손실이 발생하더라도 casting을 하면 됨
		SubCls sub = new SubCls(100, 99 ,100);
		SupCls sup = new SupCls(95, 89, 100);
		SupCls sup1 = new SubCls();//왼쪽 부모 오른쪽 자식 허용
		Object sup2 = new SubCls();//왼쪽 큰 오른쪽 작
		SubCls nsub = (SubCls)sup1; //상속 관계가 있어야 허용 없으면 허용 못함
//		SubCls sub1 = new SupCls();//왼쪽 자식 오른쪽 부모 안됨
		System.out.println(sub); //패키지이름.클래스이름@헤시코드 부모것을 상속 받지 않고 재상속 받음
		System.out.println(sup);
	}
}
