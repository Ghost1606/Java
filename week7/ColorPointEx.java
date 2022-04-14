package week7;

public class ColorPointEx {
	public static void main(String [] args) {
		Point p = new Point(); 	// Point 객체 생성
		p.set(1, 2); 						// Point 클래스의 set() 호출
		p.showPoint();
		System.out.println(p);// p의 해시코드로 출력(힙)
		System.out.println(p); // 오브젝트 클래스를 상속 받고 있어서 출력 가능
		ColorPoint cp = new ColorPoint(); 
		cp.set(3, 4); 						// Point 클래스의 set() 호출
		cp.setColor("red"); 			// ColorPoint의 setColor() 호출
		cp.showColorPoint(); 		// 컬러와 좌표 출력
	}
}
