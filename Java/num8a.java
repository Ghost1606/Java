package school;

import java.util.Scanner;

public class num8a {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		System.out.print("커피 주문하세요>>");
		
		String coffee = sc.next();
		int b = sc.nextInt();
				
		switch(coffee)
		{
		case "에스프레소" :
			System.out.println((2000*b)+"원입니다.");
			break;
		case "아메리카노" :
			System.out.println((2500*b)+"원입니다.");
			break;
		case "카푸치노" :
			System.out.println((3000*b)+"원입니다.");
			break;
		case "카페라떼" :
			System.out.println((3500*b)+"원입니다.");
			break;
		default :
			System.out.println("메뉴가 없습니다!");
			break;
		}
		sc.close();
	}

}
