package week4;

public class ArrayEx1 {

	public static void main(String[] args) {
		
		
		//int [] Arrayint;
		//Arrayint = new int [5];
		
		int[] Arrayint1 = new int[5];
		for (int i = 0; i < Arrayint1.length; i++) {
			Arrayint1[i] = i * 10;
		}
		for (int i = 0; i < Arrayint1.length; i++) {
			System.out.println(Arrayint1[i]);
		}
		int[] Arrayint2 = {1,2,3,4,5}; //더 많이 사용 for in ,foreach 같음
		for (int i : Arrayint2) {
			System.out.println(i);
		}
		int[] Arrayint3 = Arrayint2;
		for (int i : Arrayint3) {
			System.out.println(i);
		}
		
	}

}
