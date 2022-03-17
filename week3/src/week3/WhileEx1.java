package week3;

public class WhileEx1 {

	public static void main(String[] args) {
		int i , sum = 0;
		
		i = 1; //for(초기문)
		
		while (i <= 10) { //for(조건)
			
			sum += i;
			System.out.print(i);
			
			
			if(i <= 9)
			{
				System.out.print("+");
			}
			else
			{
				System.out.print("=");
				System.out.print(sum);
			}
			i++;//for(반복 작업)
		}

	}

}
