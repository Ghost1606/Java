package week3;

public class DowhileEx1 {

	public static void main(String[] args) {
		char ch ='a';
		
		do {
			System.out.print(ch);
			//ch++; 컴퓨터 안에 cpu가 1씩 증가
			ch = (char)(ch + 1); //1은 정수 ch은 문자 타입 4byte를 2byte에 넣을려고 하면 에러
		}
		while(ch <= 'z');

	}

}
