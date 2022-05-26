import java.util.Arrays;
import java.util.StringTokenizer;


public class WrapperEx {
	public static void main(String[] args) {
		/*String s1 = new String("Hello");
		s1 = s1.concat("123");
		String s2 = "hello";
		s2 = s2.concat("123");
		int k = 1;
		Integer i = 10; //현재
		Integer j = Integer.valueOf(20); //옛날
		System.out.println(i + " " + j);
		System.out.println(s1);
		System.out.println(s2);
		String java = "Java";
		String cpp = "C++";
		int res = java.compareTo(cpp);
		
		if (res == 0)
			System.out.println("Same");
		else if (res < 0)
			System.out.println(java + " < " + cpp);
		else
			System.out.println(java + " > " + cpp);*/
		
		/*String str = "Java";
		str += " is easy!!!";
		
		StringBuffer sb = new StringBuffer("Java"); //method many!(문자열을 더 다양하게 사용하고 싶으면 StringBuffer를 사용)
		sb.append(" is pencil.");
		sb.insert(7, " my "); 
		sb.replace(8, 10, "your");
		System.out.println(sb);
		System.out.println(str);*/
		
		/*String query = "name=kite&addr=seoul&age=21";
		StringTokenizer st = new StringTokenizer(query, "&"); //&기준으로 구분함
		int n = st.countTokens();
		System.out.println("토큰의 개수 = " + n);
		while(st.hasMoreElements()) {
			String token = st.nextToken();
			System.out.println(token);
		}*/
		int[] a = new int[7];
		for (int i = 0; i < a.length; i++) {
			a[i] = (int)(Math.random()*45+1);
		}
		for (int i = 0; i < a.length; i++) {
			System.out.printf("%3d", a[i]);
		}
		System.out.println();
		Arrays.sort(a);
		for (int i = 0; i < a.length; i++) {
			System.out.printf("%3d", a[i]);
		}
	}
}
