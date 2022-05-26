class GenCls<T>{ //<T>자리에 래퍼클래스 넣어주면 사용가능 (제네릭 기법)
	T a;
	
	public void print() {
		System.out.println(a);
	}
}
public class GenericEx {
	public static void main(String[] args) {
		GenCls<Integer> i = new GenCls<Integer>();
		i.print();
		GenCls<Double> d = new GenCls<Double>();
		d.print();
		GenCls<Long> l = new GenCls<Long>();
		l.print();
		GenCls<String> s = new GenCls<String>();
		s.print();
	}
}
