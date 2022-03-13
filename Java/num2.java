

import java.util.Scanner;

public class num2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("몇 층인지 입력하세요>>");

        int a = sc.nextInt();
        int h = (a * 5);

        System.out.println(h+"m"+" 입니다.");

        sc.close();
    }
}
