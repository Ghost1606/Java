package school;

import java.util.Scanner;

public class num3 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int x;
        int y;

        System.out.print("x 값을 입력하세요>>");

        x = sc.nextInt();

        y = x*x-3*x+7;

        System.out.println("x="+x+", "+"y="+y);

        sc.close();

    }

}
