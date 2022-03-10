package week2;

import java.util.Scanner;

public class InputScn {
	public static void main(String[] args) {
		int a; // 변수 선언
		String name;
		
		Scanner sc = new Scanner(System.in); //sc객체 생성
		
		System.out.print("정수 입력 : ");
		a =sc.nextInt(); //정수를 받아 a에 넣음(nextInt 사용)
		
		System.out.print("이름 입력 : ");
		name =sc.next(); //이름을 받아 name에 넣음(next사용)
		
		System.out.println(a);
		System.out.println(name);
		
		sc.close(); //안하면 10번줄 경고창 뜸
	}
}
