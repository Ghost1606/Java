package school;

import java.util.Scanner;

public class num8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("커피 주문하세요>>");
			
		String coffee = sc.next();
		int a = sc.nextInt();
		
		if(coffee.equals("에스프레소"))
		{
			System.out.println((2000*a)+"원입니다.");
		}
		else if(coffee.equals("아메리카노"))
		{
			System.out.println((2500*a)+"원입니다.");
		}
		else if(coffee.equals("카푸치노"))
		{
			System.out.println((3000*a)+"원입니다.");
		}
		else if(coffee.equals("카페라떼"))
		{
			System.out.println((3500*a)+"원입니다.");
		}
		else
		{
			System.out.println("메뉴가 없습니다!");
		}
		
		sc.close();
	}
}

