package week2;

import java.util.Scanner;

public class InputScn {
	public static void main(String[] args) {
		int a; // ���� ����
		String name;
		
		Scanner sc = new Scanner(System.in); //sc��ü ����
		
		System.out.print("���� �Է� : ");
		a =sc.nextInt(); //������ �޾� a�� ����(nextInt ���)
		
		System.out.print("�̸� �Է� : ");
		name =sc.next(); //�̸��� �޾� name�� ����(next���)
		
		System.out.println(a);
		System.out.println(name);
		
		sc.close(); //���ϸ� 10���� ���â ��
	}
}