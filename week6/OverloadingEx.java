package week6;

class MethondSample{
	// �ñ״�ó�� �ٸ��� ���� �޼ҵ� ��� �ص� ��
	int oveloadingEx(int i, int j) {
		return i + j;
	}
	int oveloadingEx(int i, int j, int k) {
		return i + j + k;
	}
	double oveloadingEx(double i, double j) {
		return i + j;
	}
	double oveloadingEx(double i, int j) {
		return i + j;
	}
	double oveloadingEx(int i, double j) {
		return i + j;
	}
	/*double overloadingEx(int i , int j) {
		return i  +j;
	}*/
}

public class OverloadingEx {

	public static void main(String[] args) {
		
	}

}