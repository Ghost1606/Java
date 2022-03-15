package school;

import java.util.Scanner;

public class num7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("학점을 입력하세요>>");
		
		String c = sc.next();
		
		switch(c)
		{
		case "A" : case "B" :
			System.out.println("Excellent");			
		break;
		case "C" : case "D":
			System.out.println("Good");
		break;
		case "F" :
			System.out.println("Bye");
		break;
		default :
        	System.out.println("잘못 입력 하셨습니다!");
        break;
		}
		
		sc.close();

	}

}
