package school;

import java.util.Scanner;

public class num1 {
    public static void main(String[] args) {
        
        int a,b;
        int s;
        
        Scanner sc = new Scanner(System.in);

        System.out.print("두 정수를 입력하세요>>");
        a = sc.nextInt();
        b = sc.nextInt();

        s = a+b;

        System.out.println(a+"+"+b+"은 "+s);

        sc.close();
    }
}

