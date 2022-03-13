import java.util.Scanner;

public class num5 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("논리 연산을 입력하세요>>");

        boolean a;
        boolean b;
        String c;

        a = sc.nextBoolean();
        b = sc.nextBoolean();
        c = sc.next();
       
        switch(c)
        {
            case "AMD":
            if(a == true && b == true)
            {
                System.out.println("true");
            }
            else
            {
                System.out.println("false");
            }
            break;
            case "OR":
            if(a == true || b == true)
            {
                System.out.println("true");
            }
            else
            {
                System.out.println("false");
            }
            break;
        }
        sc.close();
    }
}
