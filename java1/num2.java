package school;

import java.util.Scanner;

public class num2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int intArray[] = new int[10];
		
		System.out.print("정수 10개 입력>>");
		
		for(int arraybox = 0; arraybox < 10;arraybox++) {
			intArray[arraybox] = sc.nextInt(); //10개의 정수를 받음
		}
		for(int calc = 0; calc < 10;calc++) {
			if(intArray[calc] %3 == 0) //배열을 넣은 intArray를 3으로 나머지를 구함
			{
				System.out.print(intArray[calc] + " ");
			}
		}
		
		
	}

}
