package week3;

public class DowhileEx1 {

	public static void main(String[] args) {
		char ch ='a';
		
		do {
			System.out.print(ch);
			//ch++; ��ǻ�� �ȿ� cpu�� 1�� ����
			ch = (char)(ch + 1); //1�� ���� ch�� ���� Ÿ�� 4byte�� 2byte�� �������� �ϸ� ����
		}
		while(ch <= 'z');

	}

}