class Point {
	private int x, y ;

	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "Point (x=" + x + ", y=" + y + ")";
	}

	@Override // 비교할 객체 오버라이딩 해줘야함
	public boolean equals(Object obj) {
		Point p = (Point)obj; //(캐스팅)
		if(x == p.x && y == p.y)
			return true;
		else
			return false;
	}
	
}

public class PointEx {
	public static void main(String[] args) {
		Point p = new Point(2, 3);
		Point a = new Point(2, 3);
		Point b = new Point(2, 3);
		Point c = a;
		
		System.out.println(p.toString());
		
		if(a == b)
			System.out.println(a.hashCode() + "와"+b.hashCode() + "는 같습니다.");
		else
			System.out.println(a.hashCode() + "와"+b.hashCode() + "는 같지 않습니다.");
		if(a == c)
			System.out.println(a.hashCode() + "와"+c.hashCode() + "는 같습니다.");
		else
			System.out.println(a.hashCode() + "와"+c.hashCode() + "는 같지 않습니다.");
		if(a.equals(b))
			System.out.println("a와 b는 같습니다");
		else
			System.out.println("a와 b는 같지 않습니다");
		
		
		//System.out.println(p.getClass().getName());
		//System.out.println(p.hashCode()); //10진수로 나타냄
		//System.out.println(p.toString()); //16진수로 나타냄
	}
}
