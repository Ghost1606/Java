package school;

import java.util.Scanner;

public class num9 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1~99 사이의 정수를 입력하세요>>");
		
		int a = sc.nextInt();
		int b = 0;
		
		b = a/10;
		a = a%10;
		
		if(a == 3 || a == 6 || a == 9)
		{
			System.out.println("박수짝");
			if(b == 3 || b == 6 || b == 9)
			{
				System.out.println("박수짝짝");
			}
		}
		else
		{
			System.out.println("박수없음");
		}
		
		sc.close();
	}

}
