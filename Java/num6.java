package school;

import java.util.Scanner;

public class num6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("돈의 액수를 입력하세요>>");
		
		int a = sc.nextInt();
		
		int oman,man,chen,obeak,beak,sib,eli;
		
		oman = a / 50000;
		man = oman % 50000 / 10000;
		chen = man % 50000 % 10000 / 1000;
		obeak = chen % 50000 % 10000 % 1000 / 500;
		beak = obeak % 50000 % 10000 % 1000 % 500 / 100;
		sib = beak  % 50000 % 10000 % 1000 % 500 % 100 / 10;
		eli = sib  % 50000 % 10000 % 1000 % 500 % 100 % 10 / 1;
		
		if(a >= 50000)
		{
			System.out.println("오만원"+oman+"개");
		}
		else
		{
			if(a > 10000)
			{
				System.out.println("만원"+man+"개");
			}
			else
			{
				if(a > 1000)
				{
					System.out.println("천원"+chen+"개");
				}
				else
				{
					if(a > 500)
					{
						System.out.println("500원"+obeak+"개");
					}
					else
					{
						if(a > 100)
						{
							System.out.println("100원"+beak+"개");
						}
						else
						{
							if(a > 10)
							{
								System.out.println("10원"+sib+"개");
							}
							else
							{
								if(a > 1)
								{
									System.out.println("1원"+eli+"개");
								}
							}
						}
					}
				}
			}
		}
		

	}
}
	

