package week9;

public class CastTest {

	public static void main(String[] args) {
		byte b = 1; int i = 6;
		i = b; //���� ū �� ������ ���� ��
//		b = i; //������ ���� �� ���� ū �� �ȵ�
		b = (byte) i; // �����ս��� �߻��ϴ��� casting�� �ϸ� ��
		SubCls sub = new SubCls(100, 99 ,100);
		SupCls sup = new SupCls(95, 89, 100);
		SupCls sup1 = new SubCls();//���� �θ� ������ �ڽ� ���
		Object sup2 = new SubCls();//���� ū ������ ��
		SubCls nsub = (SubCls)sup1; //��� ���谡 �־�� ��� ������ ��� ����
//		SubCls sub1 = new SupCls();//���� �ڽ� ������ �θ� �ȵ�
		System.out.println(sub); //��Ű���̸�.Ŭ�����̸�@����ڵ� �θ���� ��� ���� �ʰ� ���� ����
		System.out.println(sup);
	}
}