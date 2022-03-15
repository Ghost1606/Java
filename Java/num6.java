package school;

import java.util.Scanner;

public class num6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("돈의 액수를 입력하세요>>");
		
		int money = sc.nextInt();
		
		int oman,man,chen,obeak,beak,sib,eli = 0;
		
		if(money > 0)
		{
			oman = money / 50000;
			money = money % 50000;
			man = money / 10000;
			money = money % 10000;
			chen = money / 1000;
			money = money % 1000;
			obeak = money / 500;
			money = money % 500;
			beak = money / 100;
			money = money % 100;
			sib = money / 10;
			money = money % 10;
			eli = money / 1;
			
			System.out.println("오만원"+oman+"개, "+"만원"+man+"개, "+"천원"+chen+"개, "+"500원"+obeak+"개, "+"백원"+beak+"개, "+"10원"+sib+"개, "+"1원"+eli+"개");
		}	
		sc.close();	
	}
	
}
