package school;

import java.util.Scanner;

public class num9 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1~99 사이의 정수를 입력하세요>>");
		
		int a = sc.nextInt();
		
		int b = a/10;
		int c = a%10;
		
		
		if(b%3 == 0 && c%3 == 0 || b%6 == 0 && c%6 == 0 || b%9 == 0 && c%9 == 0)
		{
			System.out.println("박수짝짝");
		}
		else if(b%3 == 0 || b%6 == 0 || b%9 == 0 || c%3 == 0 || c%6 == 0 || c%9 == 0 )
		{
			System.out.println("박수짝");
		}
		else
		{
			System.out.println("박수없음");
		}
		
		sc.close();
	}

}
