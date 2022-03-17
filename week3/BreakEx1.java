package week3;

import java.util.Scanner;

public class BreakEx1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("exit을 입력하면 종료합니다.");
		
//		while(true)
//		{
//			System.out.println(">>");
//			String text = sc.next();
//			if(text.equals("exit"))
//			{
//				break;
//			}
//		}
		for(;;)
		{
			System.out.println(">>");
			String text = sc.next();
			if(text.equals("exit"))
			{
				break;
			}
		}
		System.out.println("종료합니다.");
		sc.close();
	}

}
