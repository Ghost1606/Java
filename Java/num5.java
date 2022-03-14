package school;

import java.util.Scanner;

public class num5 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("논리 연산을 입력하세요>>");

        boolean a;
        boolean b;
        String op;
        
        a = sc.nextBoolean();
        op = sc.next();
        b = sc.nextBoolean();
        
 
        switch(op)
        {
        case "AND" :
        	System.out.println(a&&b);
        break;
        case "OR" :
        	System.out.println(a||b);
        break;
        default :
        	System.out.println("잘못 입력 하셨습니다!");
        break;
        }
        sc.close();
    }
}
